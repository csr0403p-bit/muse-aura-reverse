package com.facebook.aura.localbrowser.connector;

import X.ADq;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BNt;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.DCl;
import X.FGI;
import X.G0V;
import X.GBK;
import X.HtJ;
import X.Hu0;
import X.Hwg;
import X.HzP;
import android.net.LocalSocket;
import android.net.LocalSocketAddress;
import android.os.Process;
import android.os.SystemClock;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.SerializationException;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public final class DevToolsClient {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final byte[] HEADER_END;
    public static final byte[] LIST_REQUEST;
    public static final int MAX_HEADER_BYTES = 8192;
    public static final int MAX_RESPONSE_BYTES = 1048576;
    public static final long POLL_INTERVAL_MS = 100;
    public static final int SOCKET_TIMEOUT_MS = 1000;
    public final GBK discoveryDispatcher = Hu0.A01(AuraExecutors.INSTANCE.createResponseStreamingSerialExecutor());
    public final String socketName = FGI.A0H("webview_devtools_remote_", Process.myPid());

    @DebugMetadata(c = "com.facebook.aura.localbrowser.connector.DevToolsClient", f = "DevToolsClient.kt", l = {29, R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "findTarget", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.connector.DevToolsClient$findTarget$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DevToolsClient.this.findTarget(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.connector.DevToolsClient", f = "DevToolsClient.kt", l = {54, 69}, m = "listTargets", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$1, reason: invalid class name and case insensitive filesystem */
    public final class C124961 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C124961(HtJ<? super C124961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DevToolsClient.this.listTargets(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$2", f = "DevToolsClient.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends DevToolsTargetJson>>, Object> {
        public final /* synthetic */ String $body;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$body = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$body, htJ);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends DevToolsTargetJson>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<DevToolsTargetJson>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                return HatchJsonKt.HatchJson.A00(this.$body, C3cG.A19(DevToolsTargetJson$$serializer.INSTANCE));
            } catch (SerializationException | IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<DevToolsTargetJson>> htJ) {
            return new AnonymousClass2(this.$body, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final String listTargets$lambda$0(DevToolsClient devToolsClient, long j) throws IOException {
        try {
            LocalSocket localSocketConnect = devToolsClient.connect();
            try {
                localSocketConnect.setSoTimeout(1000);
                localSocketConnect.getOutputStream().write(LIST_REQUEST);
                localSocketConnect.getOutputStream().flush();
                InputStream inputStream = localSocketConnect.getInputStream();
                C7384Etj.A0U(inputStream);
                String responseBody = devToolsClient.readResponseBody(inputStream, Math.min(j, SystemClock.elapsedRealtime() + 1000));
                localSocketConnect.close();
                return responseBody;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    static {
        Charset charset = DCl.A01;
        HEADER_END = "\r\n\r\n".getBytes(charset);
        LIST_REQUEST = "GET /json/list HTTP/1.1\r\nHost: localhost\r\nConnection: close\r\n\r\n".getBytes(charset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object listTargets(final long r10, X.HtJ<? super java.util.List<com.facebook.aura.localbrowser.connector.DevToolsTargetJson>> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.localbrowser.connector.DevToolsClient.C124961
            if (r0 == 0) goto L24
            r7 = r12
            com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$1 r7 = (com.facebook.aura.localbrowser.connector.DevToolsClient.C124961) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r8 = 2
            r0 = 1
            if (r1 == 0) goto L2f
            if (r1 == r0) goto L4e
            if (r1 != r8) goto L2a
            X.Hwg.A00(r3)
            return r3
        L24:
            com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$1 r7 = new com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$1
            r7.<init>(r12)
            goto L12
        L2a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2f:
            X.Hwg.A00(r3)
            X.GBK r5 = r9.discoveryDispatcher
            com.facebook.aura.localbrowser.connector.DevToolsClient$$ExternalSyntheticLambda0 r4 = new com.facebook.aura.localbrowser.connector.DevToolsClient$$ExternalSyntheticLambda0
            r4.<init>()
            r7.J$0 = r10
            r7.label = r0
            r3 = 0
            r2 = 10
            r1 = 42
            X.EZD r0 = new X.EZD
            r0.<init>(r4, r3, r2, r1)
            java.lang.Object r3 = X.GAo.A00(r7, r5, r0)
            if (r3 != r6) goto L53
        L4d:
            return r6
        L4e:
            long r10 = r7.J$0
            X.Hwg.A00(r3)
        L53:
            java.lang.String r3 = (java.lang.String) r3
            r2 = 0
            if (r3 != 0) goto L59
            return r2
        L59:
            X.78T r1 = X.C3cG.A0v()
            com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$2 r0 = new com.facebook.aura.localbrowser.connector.DevToolsClient$listTargets$2
            r0.<init>(r3, r2)
            r7.L$0 = r2
            r7.J$0 = r10
            r7.label = r8
            java.lang.Object r0 = X.GAo.A00(r7, r1, r0)
            if (r0 == r6) goto L4d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.connector.DevToolsClient.listTargets(long, X.HtJ):java.lang.Object");
    }

    private final String readResponseBody(InputStream inputStream, long j) {
        int i;
        Object next;
        String strA0Q;
        String strA0l;
        Integer numA0r;
        int iIntValue;
        int i2;
        List listA0g;
        if (!(inputStream instanceof BufferedInputStream)) {
            inputStream = new BufferedInputStream(inputStream, 8192);
        }
        byte[] bArr = new byte[8192];
        int i3 = 0;
        int i4 = 0;
        while (i4 < 8192 && SystemClock.elapsedRealtime() < j && (i = inputStream.read()) >= 0) {
            int i5 = i4 + 1;
            bArr[i4] = (byte) i;
            byte[] bArr2 = HEADER_END;
            int length = bArr2.length;
            if (i5 >= length) {
                ADq aDq = new ADq(0, length - 1);
                if (!(aDq instanceof Collection) || !C3cG.A1N(aDq)) {
                    Iterator<Integer> it = aDq.iterator();
                    while (it.hasNext()) {
                        int iA00 = ((BNt) it).A00();
                        if (bArr[(i5 - bArr2.length) + iA00] == bArr2[iA00]) {
                        }
                    }
                }
                int length2 = i5 - bArr2.length;
                if (length2 >= 0) {
                    List listA0i = C7BY.A0i(new String(bArr, 0, length2, DCl.A01), new String[]{HttpRequestMultipart.LINE_FEED}, 0);
                    String str = (String) AbstractC0878AGe.A0G(listA0i);
                    if (!"200".equals((str == null || (listA0g = C7BY.A0g(str, new char[]{' '})) == null) ? null : AbstractC0878AGe.A0A(1, listA0g))) {
                        return null;
                    }
                    if (!(listA0i instanceof Collection) || !listA0i.isEmpty()) {
                        Iterator it2 = listA0i.iterator();
                        while (it2.hasNext()) {
                            if (AnonymousClass001.A0u(AnonymousClass005.A0j(it2)).startsWith("transfer-encoding:")) {
                                return null;
                            }
                        }
                    }
                    Iterator it3 = listA0i.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (AnonymousClass001.A0u((String) next).startsWith("content-length:")) {
                            break;
                        }
                    }
                    String str2 = (String) next;
                    if (str2 == null || (strA0Q = C7BY.A0Q(str2, str2, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR)) == null || (strA0l = AnonymousClass002.A0l(strA0Q)) == null || (numA0r = C9tI.A0r(strA0l)) == null || (iIntValue = numA0r.intValue()) < 0 || iIntValue >= 1048577) {
                        return null;
                    }
                    byte[] bArr3 = new byte[iIntValue];
                    while (i3 < iIntValue) {
                        if (SystemClock.elapsedRealtime() >= j || (i2 = inputStream.read(bArr3, i3, iIntValue - i3)) < 0) {
                            return null;
                        }
                        i3 += i2;
                    }
                    return new String(bArr3, DCl.A05);
                }
                return null;
            }
            i4 = i5;
        }
        return null;
    }

    public final LocalSocket connect() {
        LocalSocket localSocket = new LocalSocket();
        try {
            localSocket.connect(new LocalSocketAddress(this.socketName, LocalSocketAddress.Namespace.ABSTRACT));
            return localSocket;
        } catch (IOException e) {
            localSocket.close();
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b0 -> B:13:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findTarget(com.facebook.aura.localbrowser.connector.DevToolsIdentity r12, long r13, X.HtJ<? super java.lang.String> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.facebook.aura.localbrowser.connector.DevToolsClient.AnonymousClass1
            if (r0 == 0) goto Lb3
            r8 = r15
            com.facebook.aura.localbrowser.connector.DevToolsClient$findTarget$1 r8 = (com.facebook.aura.localbrowser.connector.DevToolsClient.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r0 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r9 = 2
            r6 = 1
            r5 = 0
            if (r1 == 0) goto L27
            if (r1 == r6) goto L42
            if (r1 != r9) goto Lba
            long r13 = r8.J$0
            java.lang.Object r12 = r8.L$0
            com.facebook.aura.localbrowser.connector.DevToolsIdentity r12 = (com.facebook.aura.localbrowser.connector.DevToolsIdentity) r12
        L27:
            X.Hwg.A00(r0)
        L2a:
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 < 0) goto L33
            return r5
        L33:
            r8.L$0 = r12
            r8.L$1 = r5
            r8.J$0 = r13
            r8.label = r6
            java.lang.Object r0 = r11.listTargets(r13, r8)
            if (r0 != r7) goto L4b
            return r7
        L42:
            long r13 = r8.J$0
            java.lang.Object r12 = r8.L$0
            com.facebook.aura.localbrowser.connector.DevToolsIdentity r12 = (com.facebook.aura.localbrowser.connector.DevToolsIdentity) r12
            X.Hwg.A00(r0)
        L4b:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L99
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r10 = r0.iterator()
        L57:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r3 = r10.next()
            r4 = r3
            com.facebook.aura.localbrowser.connector.DevToolsTargetJson r4 = (com.facebook.aura.localbrowser.connector.DevToolsTargetJson) r4
            java.lang.String r1 = r4.type
            java.lang.String r0 = "page"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            java.lang.String r1 = r4.url
            java.lang.String r0 = r12.url
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L57
            r2.add(r3)
            goto L57
        L7c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L99
            int r0 = r2.size()
            if (r0 != r6) goto Lbf
            java.lang.Object r0 = X.AbstractC0878AGe.A0J(r2)
            com.facebook.aura.localbrowser.connector.DevToolsTargetJson r0 = (com.facebook.aura.localbrowser.connector.DevToolsTargetJson) r0
            java.lang.String r7 = r0.id
            com.facebook.aura.localbrowser.connector.DevToolsClient$Companion r0 = com.facebook.aura.localbrowser.connector.DevToolsClient.Companion
            boolean r0 = r0.isValidTargetId$fbandroid_express_aura_java_com_facebook_aura_localbrowser_connector_connector(r7)
            if (r0 == 0) goto Lbf
            return r7
        L99:
            long r3 = X.C3cH.A04(r13)
            r1 = 100
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto La4
            return r5
        La4:
            r8.L$0 = r12
            r8.L$1 = r5
            r8.J$0 = r13
            r8.label = r9
            java.lang.Object r0 = X.C7Bq.A01(r1, r8)
            if (r0 != r7) goto L2a
            return r7
        Lb3:
            com.facebook.aura.localbrowser.connector.DevToolsClient$findTarget$1 r8 = new com.facebook.aura.localbrowser.connector.DevToolsClient$findTarget$1
            r8.<init>(r15)
            goto L12
        Lba:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lbf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.connector.DevToolsClient.findTarget(com.facebook.aura.localbrowser.connector.DevToolsIdentity, long, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final boolean isValidTargetId$fbandroid_express_aura_java_com_facebook_aura_localbrowser_connector_connector(String str) {
            char c;
            C7384Etj.A0Y(str, 0);
            int length = str.length();
            if (1 <= length && length < 129) {
                int i = 0;
                do {
                    char cCharAt = str.charAt(i);
                    if ('a' <= cCharAt) {
                        c = '{';
                    } else if ('A' <= cCharAt) {
                        c = '[';
                    } else if ('0' <= cCharAt) {
                        c = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
                    } else {
                        if (cCharAt != '-') {
                        }
                        i++;
                    }
                    if (cCharAt >= c) {
                    }
                    i++;
                } while (i < length);
                return true;
            }
            return false;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
