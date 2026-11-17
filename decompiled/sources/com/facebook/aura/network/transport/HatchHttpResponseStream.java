package com.facebook.aura.network.transport;

import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchHttpResponseStream implements Closeable {
    public static final Companion Companion = new Companion();
    public final InputStream body;
    public final Throwable cause;
    public final Function0<Unit> closeAction;
    public final String errorMessage;
    public final Map<String, String> headers;
    public final boolean isSuccessful;
    public final int statusCode;
    public final String statusMessage;

    /* renamed from: com.facebook.aura.network.transport.HatchHttpResponseStream$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    public final class Companion {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HatchHttpResponseStream of$default(Companion companion, int i, String str, Map map, InputStream inputStream, String str2, boolean z, Throwable th, Function0 function0, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                str = "";
            }
            if ((i2 & 64) != 0) {
                th = null;
            }
            if ((i2 & 128) != 0) {
                function0 = HatchHttpResponseStream$Companion$of$1.INSTANCE;
            }
            return companion.of(i, str, map, inputStream, str2, z, th, function0);
        }

        public final HatchHttpResponseStream of(int i, String str, Map<String, String> map, InputStream inputStream, String str2, boolean z, Throwable th, Function0<Unit> function0) {
            AnonymousClass003.A0x(str, map);
            C7384Etj.A0Y(function0, 7);
            return new HatchHttpResponseStream(i, str, map, inputStream, str2, z, th, function0);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.body;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
        this.closeAction.invoke();
    }

    public final int code() {
        return this.statusCode;
    }

    public final InputStream getBody() {
        return this.body;
    }

    public final Throwable getCause() {
        return this.cause;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    public final boolean isSuccessful() {
        return this.isSuccessful;
    }

    public final String message() {
        return this.statusMessage;
    }

    public HatchHttpResponseStream(int i, String str, Map<String, String> map, InputStream inputStream, String str2, boolean z, Throwable th, Function0<Unit> function0) {
        AnonymousClass003.A0x(str, map);
        C7384Etj.A0Y(function0, 7);
        this.statusCode = i;
        this.statusMessage = str;
        this.body = inputStream;
        this.errorMessage = str2;
        this.isSuccessful = z;
        this.cause = th;
        this.closeAction = function0;
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        C7384Etj.A0V(comparator);
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(map);
        this.headers = treeMap;
    }

    public /* synthetic */ HatchHttpResponseStream(int i, String str, Map map, InputStream inputStream, String str2, boolean z, Throwable th, Function0 function0, int i2, C06H c06h) {
        this(i, str, map, inputStream, str2, z, (i2 & 64) != 0 ? null : th, (i2 & 128) != 0 ? AnonymousClass1.INSTANCE : function0);
    }
}
