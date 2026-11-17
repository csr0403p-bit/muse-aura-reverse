package androidx.glance.appwidget.proto;

import X.AbstractC7609F5w;
import X.AbstractC9351GFk;
import X.AnonymousClass796;
import X.C064576h;
import X.C7384Etj;
import X.C79;
import X.C9372GGi;
import X.GF0;
import X.GF1;
import X.GG0;
import X.GG3;
import X.GG6;
import X.GG9;
import X.GGA;
import X.GGD;
import X.HnO;
import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.protobuf.CodedOutputStream;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class LayoutProtoSerializer implements HnO<C064576h> {
    public static final C064576h A00;
    public static final LayoutProtoSerializer A01 = new LayoutProtoSerializer();

    static {
        C064576h c064576h = C064576h.DEFAULT_INSTANCE;
        C7384Etj.A0U(c064576h);
        A00 = c064576h;
    }

    @Override // X.HnO
    public final /* bridge */ /* synthetic */ C064576h AEj() {
        return A00;
    }

    @Override // X.HnO
    public final Object AZL(InputStream inputStream) throws Throwable {
        GG9 gga;
        InvalidProtocolBufferException e;
        try {
            C064576h c064576h = C064576h.DEFAULT_INSTANCE;
            if (inputStream == null) {
                gga = new GGD(AbstractC9351GFk.A05);
                try {
                    gga.A0M(0);
                } catch (InvalidProtocolBufferException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                gga = new GGA(inputStream);
            }
            AnonymousClass796 anonymousClass796A00 = AnonymousClass796.A00();
            GF0 gf0 = (GF0) c064576h.A05(C79.A0K);
            try {
                try {
                    GG0 gg0A0V = AbstractC7609F5w.A0V(gf0);
                    GG3 gg3 = gga.A01;
                    if (gg3 == null) {
                        gg3 = new GG3(gga);
                    }
                    gg0A0V.AQd(anonymousClass796A00, gg3, gf0);
                    gg0A0V.AQ3(gf0);
                    GF0.A02(gf0);
                    return gf0;
                } catch (UninitializedMessageException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA0U = AbstractC7609F5w.A0U(e3.getMessage());
                    invalidProtocolBufferExceptionA0U.unfinishedMessage = gf0;
                    throw invalidProtocolBufferExceptionA0U;
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof InvalidProtocolBufferException) {
                        throw e4.getCause();
                    }
                    throw e4;
                }
            } catch (InvalidProtocolBufferException e5) {
                e = e5;
                if (e.wasThrownFromInputStream) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage(), e);
                    invalidProtocolBufferException.unfinishedMessage = null;
                    e = invalidProtocolBufferException;
                }
                e.unfinishedMessage = gf0;
                throw e;
            } catch (IOException e6) {
                if (e6.getCause() instanceof InvalidProtocolBufferException) {
                    throw e6.getCause();
                }
                e = new InvalidProtocolBufferException(e6.getMessage(), e6);
                e.unfinishedMessage = null;
                e.unfinishedMessage = gf0;
                throw e;
            }
        } catch (InvalidProtocolBufferException e7) {
            throw new CorruptionException("Cannot read proto.", e7);
        }
    }

    @Override // X.HnO
    public final /* bridge */ /* synthetic */ Unit Aj2(OutputStream outputStream, Object obj) throws IOException {
        GF1 gf1 = (GF1) obj;
        int iA04 = gf1.A04(null);
        if (iA04 > 4096) {
            iA04 = 4096;
        }
        GG6 gg6 = new GG6(outputStream, iA04);
        GG0 gg0A0V = AbstractC7609F5w.A0V(gf1);
        C9372GGi c9372GGi = ((CodedOutputStream) gg6).A00;
        if (c9372GGi == null) {
            c9372GGi = new C9372GGi(gg6);
        }
        gg0A0V.Aj4(c9372GGi, gf1);
        if (gg6.A00 > 0) {
            GG6.A00(gg6);
        }
        return Unit.INSTANCE;
    }
}
