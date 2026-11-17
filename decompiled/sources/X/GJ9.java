package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class GJ9 {
    public static final Charset A00 = Charset.forName(HatchWebPageParserKt.UTF_8);

    /* JADX WARN: Multi-variable type inference failed */
    public static GJ3 A00(GJ4 keyset) {
        GJ3 gj3 = GJ3.DEFAULT_INSTANCE;
        Integer num = C79.A0P;
        GHW ghwA0A = GHS.A0A(gj3, num);
        ((GJ3) GHW.A00(ghwA0A)).primaryKeyId_ = keyset.primaryKeyId_;
        for (GJA gja : keyset.key_) {
            GHW ghwA0A2 = GHS.A0A(GJ7.DEFAULT_INSTANCE, num);
            GJN gjn = gja.keyData_;
            if (gjn == null) {
                gjn = GJN.DEFAULT_INSTANCE;
            }
            String str = gjn.typeUrl_;
            GJ7 gj7 = (GJ7) GHW.A00(ghwA0A2);
            str.getClass();
            gj7.typeUrl_ = str;
            GJC gjcA0F = gja.A0F();
            GJ7 gj72 = (GJ7) GHW.A00(ghwA0A2);
            if (gjcA0F == GJC.UNRECOGNIZED) {
                throw C60O.A0i("Can't get the number of an unknown enum value.");
            }
            gj72.status_ = gjcA0F.value;
            GKP gkpA00 = GKP.A00(gja.outputPrefixType_);
            if (gkpA00 == null) {
                gkpA00 = GKP.UNRECOGNIZED;
            }
            ((GJ7) GHW.A00(ghwA0A2)).outputPrefixType_ = gkpA00.A01();
            ((GJ7) GHW.A00(ghwA0A2)).keyId_ = gja.keyId_;
            GHM ghmA02 = ghwA0A2.A02();
            GJ3 gj32 = (GJ3) GHW.A00(ghwA0A);
            GDP gdpAR1 = gj32.keyInfo_;
            if (!((GDF) gdpAR1).A00) {
                gdpAR1 = gdpAR1.AR1(gdpAR1.size() * 2);
                gj32.keyInfo_ = gdpAR1;
            }
            gdpAR1.add(ghmA02);
        }
        return (GJ3) ghwA0A.A02();
    }
}
