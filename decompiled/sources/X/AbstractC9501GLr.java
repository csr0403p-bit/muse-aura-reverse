package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;

/* renamed from: X.GLr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9501GLr {
    public static final GLC<GKV> A00;
    public static final GLF<GM2, GKV> A01;
    public static final GLD<GKZ> A02;
    public static final GLB<GMB, GKZ> A03;
    public static final C6966EdO A04;

    static {
        C6966EdO c6966EdOA01 = AbstractC10509Hny.A01("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        A04 = c6966EdOA01;
        A03 = new GLB(new C8929Ftl(1), GMB.class);
        A02 = GLD.A00(c6966EdOA01, 1);
        A01 = new GLF(new C8930Ftm(1), GM2.class);
        A00 = GLC.A00(c6966EdOA01, 1);
    }

    public static GMB A00(GJQ format, GKP outputPrefixType) throws GeneralSecurityException {
        GMN gmn;
        GMQ gmq;
        GJL gjl = GJL.DEFAULT_INSTANCE;
        GJM gjm = (GJM) GHS.A09(gjl);
        GJL gjl2 = format.dekTemplate_;
        if (gjl2 == null) {
            gjl2 = gjl;
        }
        gjm.A07(gjl2.typeUrl_);
        GJL gjl3 = format.dekTemplate_;
        if (gjl3 == null) {
            gjl3 = gjl;
        }
        gjm.A06(gjl3.value_);
        gjm.A05(GKP.RAW);
        GKQ gkqA00 = GKS.A00(gjm.A02().A0D());
        if (gkqA00 instanceof GM4) {
            gmn = GMN.A03;
        } else if (gkqA00 instanceof GMG) {
            gmn = GMN.A05;
        } else if (gkqA00 instanceof GMH) {
            gmn = GMN.A06;
        } else if (gkqA00 instanceof C9483GKz) {
            gmn = GMN.A01;
        } else if (gkqA00 instanceof GL0) {
            gmn = GMN.A02;
        } else {
            if (!(gkqA00 instanceof GM8)) {
                throw AbstractC7611F5y.A0a(gkqA00, "Unsupported DEK parameters when parsing ");
            }
            gmn = GMN.A04;
        }
        int iOrdinal = outputPrefixType.ordinal();
        if (iOrdinal == 1) {
            gmq = GMQ.A02;
        } else {
            if (iOrdinal != 3) {
                throw FGI.A0t(outputPrefixType);
            }
            gmq = GMQ.A01;
        }
        String str = format.kekUri_;
        GLK glk = (GLK) gkqA00;
        if (str == null) {
            throw BV6.A0u("kekUri must be set");
        }
        if (glk == null) {
            throw BV6.A0u("dekParametersForNewKeys must be set");
        }
        if (glk.A01()) {
            throw BV6.A0u("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((gmn.equals(GMN.A03) && (glk instanceof GM4)) || ((gmn.equals(GMN.A05) && (glk instanceof GMG)) || ((gmn.equals(GMN.A06) && (glk instanceof GMH)) || ((gmn.equals(GMN.A01) && (glk instanceof C9483GKz)) || ((gmn.equals(GMN.A02) && (glk instanceof GL0)) || (gmn.equals(GMN.A04) && (glk instanceof GM8))))))) {
            return new GMB(glk, gmn, gmq, str);
        }
        StringBuilder sbA0x = C60O.A0x("Cannot use parsing strategy ");
        BV4.A1O(sbA0x, gmn);
        sbA0x.append(" when new keys are picked according to ");
        sbA0x.append(glk);
        throw AbstractC7610F5x.A14(".", sbA0x);
    }

    public static GJQ A01(GMB parameters) {
        try {
            GJL gjl = (GJL) GHM.A03(HzL.A00(), GJL.DEFAULT_INSTANCE, ((GKZ) GL6.A01.A07(parameters.A00)).A00.A0D());
            GHW ghwA09 = GHS.A09(GJQ.DEFAULT_INSTANCE);
            String str = parameters.A02;
            GJQ gjq = (GJQ) GHW.A00(ghwA09);
            str.getClass();
            gjq.kekUri_ = str;
            GJQ gjq2 = (GJQ) GHW.A00(ghwA09);
            gjl.getClass();
            gjq2.dekTemplate_ = gjl;
            gjq2.bitField0_ |= 1;
            return (GJQ) ghwA09.A02();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
