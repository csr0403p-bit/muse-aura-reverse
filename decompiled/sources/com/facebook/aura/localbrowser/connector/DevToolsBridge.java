package com.facebook.aura.localbrowser.connector;

import X.ATD;
import X.AbstractC0903AHf;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.DCl;
import X.HxE;
import android.net.LocalSocket;
import android.os.SystemClock;
import android.util.Base64;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class DevToolsBridge implements AutoCloseable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int HANDSHAKE_TIMEOUT_MS = 2000;
    public static final int MAX_ACCEPT_ATTEMPTS = 8;
    public static final int PUMP_BUFFER_BYTES = 65536;
    public static final int TOKEN_BYTES = 32;
    public final long acceptDeadlineElapsedMs;
    public final DevToolsClient client;
    public final AtomicBoolean closed;
    public volatile Socket downstream;
    public final Executor downstreamExecutor;
    public final String endpoint;
    public final Function0<Unit> onClosed;
    public final AtomicBoolean ownerClosed;
    public final ServerSocket server;
    public final String targetId;
    public final String token;
    public volatile LocalSocket upstream;
    public final Executor upstreamExecutor;

    public final class Companion {
        public final DevToolsBridge open(String str, long j, Function0<Unit> function0, DevToolsClient devToolsClient) {
            AnonymousClass005.A11(str, function0, devToolsClient, 0);
            if (!DevToolsClient.Companion.isValidTargetId$fbandroid_express_aura_java_com_facebook_aura_localbrowser_connector_connector(str)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            DevToolsBridge devToolsBridge = new DevToolsBridge(str, devToolsClient, j, function0);
            devToolsBridge.start();
            return devToolsBridge;
        }

        public static /* synthetic */ DevToolsBridge open$default(Companion companion, String str, long j, Function0 function0, DevToolsClient devToolsClient, int i, Object obj) {
            if ((i & 8) != 0) {
                devToolsClient = new DevToolsClient();
            }
            return companion.open(str, j, function0, devToolsClient);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final HxE<Socket, byte[]> acceptValidConnection() throws IOException {
        int i = 0;
        while (true) {
            if (i >= 8) {
                break;
            }
            try {
                try {
                    long jA04 = C3cH.A04(this.acceptDeadlineElapsedMs);
                    if (jA04 <= 0 || this.closed.get()) {
                        break;
                    }
                    this.server.setSoTimeout((int) ATD.A07(jA04, 1L, 2147483647L));
                    Socket socketAccept = this.server.accept();
                    this.downstream = socketAccept;
                    if (!this.closed.get()) {
                        C7384Etj.A0X(socketAccept);
                        byte[] handshake = readHandshake(socketAccept);
                        if (handshake != null) {
                            HxE<Socket, byte[]> hxEA0r = C3cG.A0r(socketAccept, handshake);
                            if (r0 != null) {
                                try {
                                    this.server.close();
                                } catch (IOException unused) {
                                }
                            }
                            return hxEA0r;
                        }
                        try {
                            socketAccept.close();
                        } catch (IOException unused2) {
                        }
                        this.downstream = null;
                        i++;
                    } else if (socketAccept != null) {
                        socketAccept.close();
                    }
                } catch (SocketTimeoutException | IOException unused3) {
                }
            } finally {
                ServerSocket serverSocket = this.server;
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        }
        return null;
        ServerSocket serverSocket2 = this.server;
        if (serverSocket2 != null) {
            try {
                serverSocket2.close();
            } catch (IOException unused5) {
            }
        }
        return null;
    }

    private final byte[] readHandshake(Socket socket) throws IOException {
        byte[] bArrA07 = null;
        try {
            long jMin = Math.min(this.acceptDeadlineElapsedMs, SystemClock.elapsedRealtime() + 2000);
            byte[] bArr = new byte[8192];
            Integer numHeadLength = null;
            int i = 0;
            while (numHeadLength == null && i < 8192) {
                long jA04 = C3cH.A04(jMin);
                if (jA04 > 0 && !this.closed.get()) {
                    if (jA04 > 2147483647L) {
                        jA04 = 2147483647L;
                    }
                    socket.setSoTimeout((int) jA04);
                    int i2 = socket.getInputStream().read(bArr, i, 8192 - i);
                    if (i2 < 0) {
                        break;
                    }
                    i += i2;
                    numHeadLength = DevToolsHandshake.INSTANCE.headLength(bArr, i);
                } else {
                    return null;
                }
            }
            if (numHeadLength != null) {
                int iIntValue = numHeadLength.intValue();
                String str = new String(bArr, 0, iIntValue, DCl.A01);
                DevToolsHandshake devToolsHandshake = DevToolsHandshake.INSTANCE;
                String str2 = this.token;
                C7384Etj.A0T(str2);
                byte[] bArrRewrite = devToolsHandshake.rewrite(str, str2, this.targetId);
                if (bArrRewrite == null) {
                    return null;
                }
                socket.setSoTimeout(0);
                bArrA07 = AbstractC0903AHf.A07(bArrRewrite, AbstractC0903AHf.A06(bArr, iIntValue, i));
                return bArrA07;
            }
        } catch (IOException unused) {
        }
        return bArrA07;
    }

    private final void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private final void forward(final Socket socket, byte[] bArr) throws IOException {
        this.downstream = socket;
        try {
            if (this.closed.get()) {
                if (socket != null) {
                    socket.close();
                    return;
                }
                return;
            }
            try {
                final LocalSocket localSocketConnect = this.client.connect();
                this.upstream = localSocketConnect;
                if (this.closed.get()) {
                    if (localSocketConnect != null) {
                        localSocketConnect.close();
                    }
                } else {
                    localSocketConnect.getOutputStream().write(bArr);
                    localSocketConnect.getOutputStream().flush();
                    this.upstreamExecutor.execute(new Runnable() { // from class: com.facebook.aura.localbrowser.connector.DevToolsBridge$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() throws IOException {
                            this.f$0.pump(new DevToolsBridge$forward$2$1(socket), new DevToolsBridge$forward$2$2(localSocketConnect));
                        }
                    });
                    this.downstreamExecutor.execute(new Runnable() { // from class: com.facebook.aura.localbrowser.connector.DevToolsBridge$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() throws IOException {
                            this.f$0.pump(new DevToolsBridge$forward$3$1(localSocketConnect), new DevToolsBridge$forward$3$2(socket));
                        }
                    });
                }
            } catch (IOException unused) {
                shutdown();
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pump(Function0<? extends InputStream> function0, Function0<? extends OutputStream> function02) throws IOException {
        byte[] bArr = new byte[65536];
        try {
            InputStream inputStreamInvoke = function0.invoke();
            OutputStream outputStreamInvoke = function02.invoke();
            while (true) {
                int i = inputStreamInvoke.read(bArr);
                if (i < 0) {
                    break;
                }
                outputStreamInvoke.write(bArr, 0, i);
                outputStreamInvoke.flush();
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            shutdown();
            throw th;
        }
        shutdown();
    }

    private final void shutdown() throws IOException {
        if (C3cI.A1W(this.closed)) {
            ServerSocket serverSocket = this.server;
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException unused) {
                }
            }
            Socket socket = this.downstream;
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused2) {
                }
            }
            LocalSocket localSocket = this.upstream;
            if (localSocket != null) {
                try {
                    localSocket.close();
                } catch (IOException unused3) {
                }
            }
            if (this.ownerClosed.get()) {
                return;
            }
            this.onClosed.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void start() {
        this.upstreamExecutor.execute(new Runnable() { // from class: com.facebook.aura.localbrowser.connector.DevToolsBridge$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                DevToolsBridge.start$lambda$0(this.f$0);
            }
        });
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.ownerClosed.set(true);
        shutdown();
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public DevToolsBridge(String str, DevToolsClient devToolsClient, long j, Function0<Unit> function0) {
        this.targetId = str;
        this.client = devToolsClient;
        this.acceptDeadlineElapsedMs = j;
        this.onClosed = function0;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        this.token = strEncodeToString;
        ServerSocket serverSocket = new ServerSocket(0, 1, InetAddress.getByAddress(new byte[]{Byte.MAX_VALUE, 0, 0, 1}));
        this.server = serverSocket;
        this.closed = new AtomicBoolean(false);
        this.ownerClosed = new AtomicBoolean(false);
        AuraExecutors auraExecutors = AuraExecutors.INSTANCE;
        this.upstreamExecutor = auraExecutors.createResponseStreamingSerialExecutor();
        this.downstreamExecutor = auraExecutors.createResponseStreamingSerialExecutor();
        int localPort = serverSocket.getLocalPort();
        StringBuilder sb = new StringBuilder("ws://127.0.0.1:");
        sb.append(localPort);
        sb.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sb.append(strEncodeToString);
        sb.append("/devtools/page/");
        this.endpoint = AnonymousClass001.A0v(str, sb);
    }

    public static final void start$lambda$0(DevToolsBridge devToolsBridge) throws IOException {
        HxE<Socket, byte[]> hxEAcceptValidConnection = devToolsBridge.acceptValidConnection();
        if (hxEAcceptValidConnection == null) {
            devToolsBridge.shutdown();
        } else {
            devToolsBridge.forward(hxEAcceptValidConnection.first, hxEAcceptValidConnection.second);
        }
    }

    public /* synthetic */ DevToolsBridge(String str, DevToolsClient devToolsClient, long j, Function0 function0, C06H c06h) {
        this(str, devToolsClient, j, function0);
    }
}
