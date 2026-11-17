package X;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes6.dex */
public final class I0R implements GLI {
    public final int $t;

    public I0R(int i) {
        this.$t = i;
    }

    @Override // X.GLI
    public final Object A6u(AbstractC9465GKh abstractC9465GKh) throws GeneralSecurityException {
        EX9 ex9A01;
        C6966EdO c6966EdOA0S;
        C6966EdO c6966EdOA0S2;
        C6966EdO c6966EdOA0S3;
        switch (this.$t) {
            case 0:
                GMI gmi = (GMI) abstractC9465GKh;
                EnumC7335ElD enumC7335ElD = C6959EdF.A02;
                GM4 gm4 = gmi.A00;
                int i = gm4.A00;
                if (i != 12) {
                    throw FGI.A0u("Expected IV Size 12, got ", i);
                }
                int i2 = gm4.A02;
                if (i2 != 16) {
                    throw FGI.A0u("Expected tag Size 16, got ", i2);
                }
                return new C6959EdF(gmi.A01, gmi.A02.A00.A01());
            case 1:
                Hnc hnc = (Hnc) abstractC9465GKh;
                if (!EdK.A04.A00()) {
                    throw BV6.A0u(BV3.A00(26));
                }
                GL0 gl0 = hnc.A00;
                int i3 = gl0.A02;
                if (i3 != 16) {
                    throw FGI.A0u("AesEaxJce only supports 16 byte tag size, not ", i3);
                }
                return new EdK(hnc.A02.A00.A01(), hnc.A01.A01(), gl0.A00);
            case 2:
                C9507GLy c9507GLy = (C9507GLy) abstractC9465GKh;
                int i4 = c9507GLy.A00.A00;
                if (i4 < 8) {
                    throw BV6.A0u(BV3.A00(67));
                }
                return new C6964EdL(c9507GLy.A01, c9507GLy.A02.A00.A01(), i4);
            case 3:
                GKV gkv = ((C9475GKr) abstractC9465GKh).A00;
                ex9A01 = (EX9) C10437Hhj.A02.A01(EX9.class, gkv.A05).A00(gkv.A02);
                GKP gkp = gkv.A01;
                int iOrdinal = gkp.ordinal();
                if (iOrdinal == 3) {
                    c6966EdOA0S = AbstractC9478GKu.A00;
                    break;
                } else if (iOrdinal == 2 || iOrdinal == 4) {
                    c6966EdOA0S = AbstractC7608F5v.A0S(gkv.A04);
                    break;
                } else {
                    if (iOrdinal != 1) {
                        throw AbstractC7611F5y.A0a(gkp, "unknown output prefix type ");
                    }
                    c6966EdOA0S = AbstractC7608F5v.A0T(gkv.A04);
                    break;
                }
                break;
            case 4:
                GM1 gm1 = (GM1) abstractC9465GKh;
                InterfaceC9472GKo<GMD> interfaceC9472GKo = GMA.A00;
                String str = gm1.A00.A01;
                ex9A01 = AbstractC10515HoS.A00(str).A01(str);
                c6966EdOA0S = gm1.A01;
                break;
            case 5:
                GM2 gm2 = (GM2) abstractC9465GKh;
                InterfaceC9472GKo<GMB> interfaceC9472GKo2 = GM7.A00;
                GMB gmb = gm2.A00;
                String str2 = gmb.A02;
                GLK glk = gmb.A00;
                try {
                    ex9A01 = new C9470GKm(AbstractC10515HoS.A00(str2).A01(str2), (GJL) GHM.A03(HzL.A00(), GJL.DEFAULT_INSTANCE, ((GKZ) GL6.A01.A07(glk)).A00.A0D()));
                    c6966EdOA0S = gm2.A01;
                    break;
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException(e);
                }
            case 6:
                C9492GLi c9492GLi = (C9492GLi) abstractC9465GKh;
                C9490GLg c9490GLg = c9492GLi.A00;
                GLE<C9492GLi, EXA> gle = AbstractC9489GLf.A03;
                int i5 = c9490GLg.A00;
                if (i5 != 64) {
                    throw new InvalidAlgorithmParameterException(FGI.A0I("invalid key size: ", i5, ". Valid keys must have 64 bytes."));
                }
                EnumC7335ElD enumC7335ElD2 = C6963EdJ.A03;
                return new C6963EdJ(c9492GLi.A01, c9492GLi.A02.A00.A01());
            case 7:
                GKV gkv2 = ((C9475GKr) abstractC9465GKh).A00;
                EXA exa = (EXA) C10437Hhj.A02.A01(EXA.class, gkv2.A05).A00(gkv2.A02);
                GKP gkp2 = gkv2.A01;
                int iOrdinal2 = gkp2.ordinal();
                if (iOrdinal2 == 3) {
                    c6966EdOA0S2 = AbstractC9478GKu.A00;
                } else if (iOrdinal2 == 2 || iOrdinal2 == 4) {
                    c6966EdOA0S2 = AbstractC7608F5v.A0S(gkv2.A04);
                } else {
                    if (iOrdinal2 != 1) {
                        throw FGI.A0u("unknown output prefix type ", gkp2.A01());
                    }
                    c6966EdOA0S2 = AbstractC7608F5v.A0T(gkv2.A04);
                }
                return new C6972EdU(exa, gkp2, c6966EdOA0S2.A01());
            case 8:
                GKV gkv3 = ((C9475GKr) abstractC9465GKh).A00;
                FWR fwr = (FWR) C10437Hhj.A02.A01(FWR.class, gkv3.A05).A00(gkv3.A02);
                int iOrdinal3 = gkv3.A01.ordinal();
                if (iOrdinal3 == 3) {
                    c6966EdOA0S3 = AbstractC9478GKu.A00;
                } else if (iOrdinal3 == 2 || iOrdinal3 == 4) {
                    c6966EdOA0S3 = AbstractC7608F5v.A0S(gkv3.A04);
                } else {
                    if (iOrdinal3 != 1) {
                        throw BV6.A0u("unknown output prefix type");
                    }
                    c6966EdOA0S3 = AbstractC7608F5v.A0T(gkv3.A04);
                }
                return new Hp0(fwr, c6966EdOA0S3.A01());
            default:
                return null;
        }
        return new C6971EdT(ex9A01, c6966EdOA0S.A01());
    }
}
