package X;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Map;

/* renamed from: X.GKn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9471GKn {
    public static final InterfaceC9472GKo<GKU> A01;
    public static final C9471GKn A02;
    public final Map<Class<? extends GKQ>, InterfaceC9472GKo<? extends GKQ>> A00 = BV4.A0u();

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r8v0 X.GKn) */
    public static synchronized AbstractC9465GKh A00(GKQ gkq, C9471GKn c9471GKn, Integer num) {
        AbstractC9465GKh ho4;
        synchronized (c9471GKn) {
            InterfaceC9472GKo<? extends GKQ> interfaceC9472GKo = c9471GKn.A00.get(gkq.getClass());
            if (interfaceC9472GKo == null) {
                throw AbstractC7610F5x.A14(": no key creator for this class was registered.", C3cG.A0f(gkq, "Cannot create a new key for parameters "));
            }
            switch (((I12) interfaceC9472GKo).$t) {
                case 0:
                    C9483GKz c9483GKz = (C9483GKz) gkq;
                    GLE<C10536Hqh, EX9> gle = GL2.A04;
                    int i = c9483GKz.A00;
                    if (i != 16 && i != 32) {
                        throw BV6.A0u("AES key size must be 16 or 32 bytes");
                    }
                    Hp7 hp7A00 = Hp7.A00(i);
                    int i2 = c9483GKz.A01;
                    Hp7 hp7A002 = Hp7.A00(i2);
                    if (i != hp7A00.A00.A00.length) {
                        throw BV6.A0u("AES key size mismatch");
                    }
                    if (i2 != hp7A002.A00.A00.length) {
                        throw BV6.A0u("HMAC key size mismatch");
                    }
                    if (c9483GKz.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new C10536Hqh(c9483GKz, AbstractC9477GKt.A00(c9483GKz, num), hp7A00, hp7A002, num);
                    break;
                    break;
                case 1:
                    GL0 gl0 = (GL0) gkq;
                    GLE<Hnc, EX9> gle2 = GL1.A02;
                    int i3 = gl0.A01;
                    if (i3 == 24) {
                        throw BV6.A0u("192 bit AES GCM Parameters are not valid");
                    }
                    Hp7 hp7A003 = Hp7.A00(i3);
                    if (i3 != hp7A003.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gl0.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new Hnc(gl0, AbstractC9476GKs.A00(gl0, num), hp7A003, num);
                    break;
                case 2:
                    GM4 gm4 = (GM4) gkq;
                    GLE<GMI, EX9> gle3 = GM3.A04;
                    int i4 = gm4.A01;
                    if (i4 == 24) {
                        throw BV6.A0u("192 bit AES GCM Parameters are not valid");
                    }
                    Hp7 hp7A004 = Hp7.A00(i4);
                    if (i4 != hp7A004.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gm4.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new GMI(gm4, GME.A00(gm4, num), hp7A004, num);
                    break;
                case 3:
                    GM8 gm8 = (GM8) gkq;
                    GLE<HjH, EX9> gle4 = GM5.A03;
                    int i5 = gm8.A00;
                    Hp7 hp7A005 = Hp7.A00(i5);
                    if (i5 != hp7A005.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gm8.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new HjH(gm8, GMF.A00(gm8, num), hp7A005, num);
                    break;
                case 4:
                    GLE<C9508GLz, EX9> gle5 = GM9.A02;
                    ho4 = C9508GLz.A01(((GMG) gkq).A00, Hp7.A00(32), num);
                    break;
                case 5:
                    InterfaceC9472GKo<GMD> interfaceC9472GKo2 = GMA.A00;
                    ho4 = GM1.A01((GMD) gkq, num);
                    break;
                case 6:
                    InterfaceC9472GKo<GMB> interfaceC9472GKo3 = GM7.A00;
                    ho4 = GM2.A01((GMB) gkq, num);
                    break;
                case 7:
                    ho4 = C9507GLy.A01((GMC) gkq, Hp7.A00(32), num);
                    break;
                case 8:
                    InterfaceC9472GKo<GMH> interfaceC9472GKo4 = GM6.A00;
                    ho4 = GM0.A01(((GMH) gkq).A00, Hp7.A00(32), num);
                    break;
                case 9:
                    C9490GLg c9490GLg = (C9490GLg) gkq;
                    GLE<C9492GLi, EXA> gle6 = AbstractC9489GLf.A03;
                    int i6 = c9490GLg.A00;
                    if (i6 != 64) {
                        throw new InvalidAlgorithmParameterException(FGI.A0I("invalid key size: ", i6, ". Valid keys must have 64 bytes."));
                    }
                    Hp7 hp7A006 = Hp7.A00(i6);
                    if (i6 != hp7A006.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (c9490GLg.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new C9492GLi(c9490GLg, AbstractC9491GLh.A00(c9490GLg, num), hp7A006, num);
                    break;
                case 10:
                    GJL gjl = ((GKU) gkq).A00.A00;
                    C10437Hhj c10437Hhj = C10437Hhj.A02;
                    GKT gktA00 = C10437Hhj.A00(c10437Hhj, gjl.typeUrl_);
                    if (!AnonymousClass001.A1X(c10437Hhj.A01.get(gjl.typeUrl_))) {
                        throw BV6.A0u("Creating new keys is not allowed.");
                    }
                    AbstractC9321GEc abstractC9321GEc = gjl.value_;
                    GJM gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                    gjm.A07(gktA00.A03);
                    gjm.A06(abstractC9321GEc);
                    gjm.A05(GKP.RAW);
                    GJL gjl2 = (GJL) gjm.A02();
                    GKZ gkz = new GKZ(gjl2, AbstractC10509Hny.A00(gjl2.typeUrl_));
                    GL6 gl6 = GL6.A01;
                    GKV gkv = (GKV) gl6.A06(A00(gl6.A05(gkz), A02, null));
                    GJP gjp = (GJP) GHS.A09(GJN.DEFAULT_INSTANCE);
                    String str = gkv.A05;
                    GJN gjn = (GJN) GHW.A00(gjp);
                    str.getClass();
                    gjn.typeUrl_ = str;
                    AbstractC9321GEc abstractC9321GEc2 = gkv.A02;
                    GJN gjn2 = (GJN) GHW.A00(gjp);
                    abstractC9321GEc2.getClass();
                    gjn2.value_ = abstractC9321GEc2;
                    GJO gjo = gkv.A00;
                    GJN gjn3 = (GJN) GHW.A00(gjp);
                    if (gjo == GJO.UNRECOGNIZED) {
                        throw C60O.A0i("Can't get the number of an unknown enum value.");
                    }
                    gjn3.keyMaterialType_ = gjo.value;
                    GJN gjn4 = (GJN) gjp.A02();
                    String str2 = gjn4.typeUrl_;
                    ho4 = new C9475GKr(GKV.A00(gjn4.A0F(), gjl.A0F(), gjn4.value_, num, str2));
                    break;
                case 11:
                    GLV glv = (GLV) gkq;
                    GLE<Htd, Hwz> gle7 = GLT.A02;
                    int i7 = glv.A00;
                    if (i7 != 32) {
                        throw BV6.A0u(BV3.A00(24));
                    }
                    Hp7 hp7A007 = Hp7.A00(i7);
                    if (i7 != hp7A007.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (glv.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new Htd(glv, GLX.A00(glv, num), hp7A007, num);
                    break;
                case 12:
                    GLO glo = (GLO) gkq;
                    GLE<Ho4, Hwz> gle8 = GLQ.A04;
                    int i8 = glo.A00;
                    Hp7 hp7A008 = Hp7.A00(i8);
                    if (i8 != hp7A008.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (glo.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    ho4 = new Ho4(glo, GLP.A00(glo, num), hp7A008, num);
                    break;
                default:
                    ho4 = null;
                    break;
            }
        }
        return ho4;
    }

    static {
        I12 i12 = new I12(10);
        A01 = i12;
        C9471GKn c9471GKn = new C9471GKn();
        try {
            c9471GKn.A01(i12, GKU.class);
            A02 = c9471GKn;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public final synchronized <ParametersT extends GKQ> void A01(InterfaceC9472GKo<ParametersT> creator, Class<ParametersT> parametersClass) {
        Map<Class<? extends GKQ>, InterfaceC9472GKo<? extends GKQ>> map = this.A00;
        InterfaceC9472GKo<? extends GKQ> interfaceC9472GKo = map.get(parametersClass);
        if (interfaceC9472GKo != null && !interfaceC9472GKo.equals(creator)) {
            throw AbstractC7610F5x.A14(" already inserted", C3cG.A0f(parametersClass, "Different key creator for parameters class "));
        }
        map.put(parametersClass, creator);
    }
}
