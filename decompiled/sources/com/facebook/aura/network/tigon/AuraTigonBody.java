package com.facebook.aura.network.tigon;

import X.C06H;
import X.C7384Etj;
import X.CYT;
import X.F0C;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.tigon.TigonBodyProvider;
import com.facebook.tigon.TigonXplatBodyProvider;
import java.io.InputStream;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraTigonBody {
    public static final Companion Companion = new Companion();
    public final long contentLength;
    public final String contentType;
    public final Function0<InputStream> openStream;

    public final class Companion {
        public final AuraTigonBody bytes(byte[] bArr, String str) {
            C7384Etj.A0Y(bArr, 0);
            return new AuraTigonBody(bArr.length, str, new AuraTigonBody$Companion$bytes$1(bArr));
        }

        public final AuraTigonBody stream(long j, String str, Function0<? extends InputStream> function0) {
            C7384Etj.A0Y(function0, 2);
            return new AuraTigonBody(j, str, function0);
        }

        public static /* synthetic */ AuraTigonBody bytes$default(Companion companion, byte[] bArr, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "application/json; charset=utf-8";
            }
            return companion.bytes(bArr, str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final TigonBodyProvider createProvider() {
        TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
        return new CYT(this.openStream.invoke(), F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate), this.contentLength);
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public /* synthetic */ AuraTigonBody(long j, String str, Function0 function0, C06H c06h) {
        this(j, str, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuraTigonBody(long j, String str, Function0<? extends InputStream> function0) {
        this.contentLength = j;
        this.contentType = str;
        this.openStream = function0;
    }
}
