package X;

import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class GL6 {
    public static final GL6 A01;
    public final AtomicReference<GL5> A00;

    public final synchronized <SerializationT extends GLJ> void A08(GLC<SerializationT> parser) {
        AtomicReference<GL5> atomicReference = this.A00;
        GL5 gl5 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl5.A01);
        HashMap mapA0w2 = BV4.A0w(gl5.A00);
        HashMap mapA0w3 = BV4.A0w(gl5.A03);
        HashMap mapA0w4 = BV4.A0w(gl5.A02);
        Hqs hqs = new Hqs(parser.A00, GKV.class);
        if (mapA0w2.containsKey(hqs)) {
            Object obj = mapA0w2.get(hqs);
            if (!obj.equals(parser) || !parser.equals(obj)) {
                throw AbstractC7611F5y.A0a(hqs, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            mapA0w2.put(hqs, parser);
        }
        atomicReference.set(new GL5(mapA0w2, mapA0w, mapA0w4, mapA0w3));
    }

    public final synchronized <KeyT extends AbstractC9465GKh, SerializationT extends GLJ> void A09(GLF<KeyT, SerializationT> serializer) {
        AtomicReference<GL5> atomicReference = this.A00;
        GL5 gl5 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl5.A01);
        HashMap mapA0w2 = BV4.A0w(gl5.A00);
        HashMap mapA0w3 = BV4.A0w(gl5.A03);
        HashMap mapA0w4 = BV4.A0w(gl5.A02);
        Ho7 ho7 = new Ho7(serializer.A00, GKV.class);
        if (mapA0w.containsKey(ho7)) {
            Object obj = mapA0w.get(ho7);
            if (!obj.equals(serializer) || !serializer.equals(obj)) {
                throw AbstractC7611F5y.A0a(ho7, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            mapA0w.put(ho7, serializer);
        }
        atomicReference.set(new GL5(mapA0w2, mapA0w, mapA0w4, mapA0w3));
    }

    public final synchronized <SerializationT extends GLJ> void A0A(GLD<SerializationT> parser) {
        AtomicReference<GL5> atomicReference = this.A00;
        GL5 gl5 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl5.A01);
        HashMap mapA0w2 = BV4.A0w(gl5.A00);
        HashMap mapA0w3 = BV4.A0w(gl5.A03);
        HashMap mapA0w4 = BV4.A0w(gl5.A02);
        Hqs hqs = new Hqs(parser.A00, GKZ.class);
        if (mapA0w4.containsKey(hqs)) {
            Object obj = mapA0w4.get(hqs);
            if (!obj.equals(parser) || !parser.equals(obj)) {
                throw AbstractC7611F5y.A0a(hqs, "Attempt to register non-equal parser for already existing object of type: ");
            }
        } else {
            mapA0w4.put(hqs, parser);
        }
        atomicReference.set(new GL5(mapA0w2, mapA0w, mapA0w4, mapA0w3));
    }

    public final synchronized <ParametersT extends GKQ, SerializationT extends GLJ> void A0B(GLB<ParametersT, SerializationT> serializer) {
        AtomicReference<GL5> atomicReference = this.A00;
        GL5 gl5 = atomicReference.get();
        HashMap mapA0w = BV4.A0w(gl5.A01);
        HashMap mapA0w2 = BV4.A0w(gl5.A00);
        HashMap mapA0w3 = BV4.A0w(gl5.A03);
        HashMap mapA0w4 = BV4.A0w(gl5.A02);
        Ho7 ho7 = new Ho7(serializer.A00, GKZ.class);
        if (mapA0w3.containsKey(ho7)) {
            Object obj = mapA0w3.get(ho7);
            if (!obj.equals(serializer) || !serializer.equals(obj)) {
                throw AbstractC7611F5y.A0a(ho7, "Attempt to register non-equal serializer for already existing object of type: ");
            }
        } else {
            mapA0w3.put(ho7, serializer);
        }
        atomicReference.set(new GL5(mapA0w2, mapA0w, mapA0w4, mapA0w3));
    }

    static {
        try {
            GL6 gl6 = new GL6();
            gl6.A09(new GLF(new C8930Ftm(10), C9475GKr.class));
            A01 = gl6;
        } catch (Exception e) {
            throw new TinkBugException(e);
        }
    }

    public static C9324GEf A01(GHW ghw, Hp7 hp7) {
        byte[] bArrA01 = hp7.A00.A01();
        C9324GEf c9324GEfA01 = AbstractC9321GEc.A01(bArrA01, 0, bArrA01.length);
        ghw.A04();
        return c9324GEfA01;
    }

    public final AbstractC9465GKh A04(GLJ glj) {
        GMO gmo;
        GMR gmr;
        GMM gmm;
        GML gml;
        GMK gmk;
        C9480GKw c9480GKw;
        C9479GKv c9479GKv;
        GMP gmp;
        GL5 gl5 = this.A00.get();
        Hqs hqs = new Hqs(glj.AIC(), glj.getClass());
        Map<Hqs, GLC<?>> map = gl5.A00;
        if (!map.containsKey(hqs)) {
            throw AbstractC7610F5x.A14(" available", C3cG.A0f(hqs, "No Key Parser for requested key type "));
        }
        switch (((C8935Ftr) map.get(hqs).A01).$t) {
            case 0:
                GKV gkv = (GKV) glj;
                if (!gkv.A05.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw C60O.A0i("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
                }
                try {
                    C9442GJg c9442GJg = (C9442GJg) GHM.A01(gkv.A02, HzL.A00(), C9442GJg.DEFAULT_INSTANCE);
                    if (c9442GJg.version_ != 0) {
                        throw AbstractC7611F5y.A0a(c9442GJg, "KmsAeadKey are only accepted with version 0, got ");
                    }
                    GJD gjd = c9442GJg.params_;
                    if (gjd == null) {
                        gjd = GJD.DEFAULT_INSTANCE;
                    }
                    String str = gjd.keyUri_;
                    GKP gkp = gkv.A01;
                    int iOrdinal = gkp.ordinal();
                    if (iOrdinal == 1) {
                        gmp = GMP.A02;
                    } else {
                        if (iOrdinal != 3) {
                            throw FGI.A0t(gkp);
                        }
                        gmp = GMP.A01;
                    }
                    return GM1.A01(new GMD(gmp, str), gkv.A04);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
                }
            case 1:
                GKV gkv2 = (GKV) glj;
                if (!gkv2.A05.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw C60O.A0i("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
                }
                try {
                    GJi gJi = (GJi) GHM.A01(gkv2.A02, HzL.A00(), GJi.DEFAULT_INSTANCE);
                    if (gJi.version_ != 0) {
                        throw AbstractC7611F5y.A0a(gJi, "KmsEnvelopeAeadKeys are only accepted with version 0, got ");
                    }
                    GJQ gjq = gJi.params_;
                    if (gjq == null) {
                        gjq = GJQ.DEFAULT_INSTANCE;
                    }
                    return GM2.A01(AbstractC9501GLr.A00(gjq, gkv2.A01), gkv2.A04);
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e2);
                }
            case 2:
                GKV gkv3 = (GKV) glj;
                if (!gkv3.A05.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    GKH gkh = (GKH) GHM.A01(gkv3.A02, HzL.A00(), GKH.DEFAULT_INSTANCE);
                    if (gkh.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    GKA gka = gkh.aesCtrKey_;
                    GKA gka2 = gka;
                    if (gka == null) {
                        gka = GKA.DEFAULT_INSTANCE;
                    }
                    if (gka.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    GKE gke = gkh.hmacKey_;
                    GKE gke2 = gke;
                    if (gke == null) {
                        gke = GKE.DEFAULT_INSTANCE;
                    }
                    if (gke.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys inner HMAC keys are accepted");
                    }
                    GKA gka3 = gka2;
                    if (gka2 == null) {
                        gka3 = GKA.DEFAULT_INSTANCE;
                    }
                    int iA02 = gka3.keyValue_.A02();
                    if (iA02 != 16 && iA02 != 24 && iA02 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(iA02)});
                    }
                    Integer numValueOf = Integer.valueOf(iA02);
                    GKE gke3 = gke2;
                    if (gke2 == null) {
                        gke3 = GKE.DEFAULT_INSTANCE;
                    }
                    int iA022 = gke3.keyValue_.A02();
                    Integer numValueOf2 = Integer.valueOf(iA022);
                    if (iA022 < 16) {
                        throw AbstractC7609F5w.A0w("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{numValueOf2});
                    }
                    if (gka2 == null) {
                        gka2 = GKA.DEFAULT_INSTANCE;
                    }
                    C9436GJa c9436GJa = gka2.params_;
                    if (c9436GJa == null) {
                        c9436GJa = C9436GJa.DEFAULT_INSTANCE;
                    }
                    int i = c9436GJa.ivSize_;
                    if (i < 12 || i > 16) {
                        throw AbstractC7609F5w.A0v("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", new Object[]{Integer.valueOf(i)});
                    }
                    Integer numValueOf3 = Integer.valueOf(i);
                    GKE gke4 = gke2;
                    if (gke2 == null) {
                        gke4 = GKE.DEFAULT_INSTANCE;
                    }
                    GKJ gkj = gke4.params_;
                    if (gkj == null) {
                        gkj = GKJ.DEFAULT_INSTANCE;
                    }
                    int i2 = gkj.tagSize_;
                    Integer numValueOf4 = Integer.valueOf(i2);
                    if (i2 < 10) {
                        throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{numValueOf4});
                    }
                    if (gke2 == null) {
                        gke2 = GKE.DEFAULT_INSTANCE;
                    }
                    GKJ gkj2 = gke2.params_;
                    if (gkj2 == null) {
                        gkj2 = GKJ.DEFAULT_INSTANCE;
                    }
                    GL4 gl4A00 = AbstractC9481GKx.A00(gkj2.A0F());
                    GKP gkp2 = gkv3.A01;
                    int iOrdinal2 = gkp2.ordinal();
                    if (iOrdinal2 == 1) {
                        c9479GKv = C9479GKv.A03;
                    } else if (iOrdinal2 == 4 || iOrdinal2 == 2) {
                        c9479GKv = C9479GKv.A01;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw FGI.A0t(gkp2);
                        }
                        c9479GKv = C9479GKv.A02;
                    }
                    C9483GKz c9483GKzA00 = GL3.A00(gl4A00, c9479GKv, numValueOf, numValueOf2, numValueOf3, numValueOf4);
                    GKA gka4 = gkh.aesCtrKey_;
                    if (gka4 == null) {
                        gka4 = GKA.DEFAULT_INSTANCE;
                    }
                    Hp7 hp7A02 = A02(gka4.keyValue_);
                    GKE gke5 = gkh.hmacKey_;
                    if (gke5 == null) {
                        gke5 = GKE.DEFAULT_INSTANCE;
                    }
                    Hp7 hp7A022 = A02(gke5.keyValue_);
                    Integer num = gkv3.A04;
                    if (c9483GKzA00.A00 != hp7A02.A00.A00.length) {
                        throw BV6.A0u("AES key size mismatch");
                    }
                    if (c9483GKzA00.A01 != hp7A022.A00.A00.length) {
                        throw BV6.A0u("HMAC key size mismatch");
                    }
                    if (c9483GKzA00.A01()) {
                        if (num == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new C10536Hqh(c9483GKzA00, AbstractC9477GKt.A00(c9483GKzA00, num), hp7A02, hp7A022, num);
                } catch (InvalidProtocolBufferException unused) {
                    throw BV6.A0u("Parsing AesCtrHmacAeadKey failed");
                }
            case 3:
                GKV gkv4 = (GKV) glj;
                if (!gkv4.A05.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    GKC gkc = (GKC) GHM.A01(gkv4.A02, HzL.A00(), GKC.DEFAULT_INSTANCE);
                    if (gkc.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int iA023 = gkc.keyValue_.A02();
                    if (iA023 != 16 && iA023 != 24 && iA023 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(iA023)});
                    }
                    Integer numValueOf5 = Integer.valueOf(iA023);
                    GJY gjy = gkc.params_;
                    if (gjy == null) {
                        gjy = GJY.DEFAULT_INSTANCE;
                    }
                    int i3 = gjy.ivSize_;
                    if (i3 != 12 && i3 != 16) {
                        throw AbstractC7609F5w.A0v("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", new Object[]{Integer.valueOf(i3)});
                    }
                    Integer numValueOf6 = Integer.valueOf(i3);
                    GKP gkp3 = gkv4.A01;
                    int iOrdinal3 = gkp3.ordinal();
                    if (iOrdinal3 == 1) {
                        c9480GKw = C9480GKw.A03;
                    } else if (iOrdinal3 == 4 || iOrdinal3 == 2) {
                        c9480GKw = C9480GKw.A01;
                    } else {
                        if (iOrdinal3 != 3) {
                            throw FGI.A0t(gkp3);
                        }
                        c9480GKw = C9480GKw.A02;
                    }
                    GL0 gl0 = new GL0(c9480GKw, numValueOf5.intValue(), numValueOf6.intValue());
                    Hp7 hp7A023 = A02(gkc.keyValue_);
                    Integer num2 = gkv4.A04;
                    if (gl0.A01 != hp7A023.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gl0.A01()) {
                        if (num2 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num2 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new Hnc(gl0, AbstractC9476GKs.A00(gl0, num2), hp7A023, num2);
                } catch (InvalidProtocolBufferException unused2) {
                    throw BV6.A0u("Parsing AesEaxcKey failed");
                }
            case 4:
                GKV gkv5 = (GKV) glj;
                if (!gkv5.A05.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    GK2 gk2 = (GK2) GHM.A01(gkv5.A02, HzL.A00(), GK2.DEFAULT_INSTANCE);
                    if (gk2.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int iA024 = gk2.keyValue_.A02();
                    if (iA024 != 16 && iA024 != 24 && iA024 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(iA024)});
                    }
                    Integer numValueOf7 = Integer.valueOf(iA024);
                    GKP gkp4 = gkv5.A01;
                    int iOrdinal4 = gkp4.ordinal();
                    if (iOrdinal4 == 1) {
                        gmk = GMK.A03;
                    } else if (iOrdinal4 == 4 || iOrdinal4 == 2) {
                        gmk = GMK.A01;
                    } else {
                        if (iOrdinal4 != 3) {
                            throw FGI.A0t(gkp4);
                        }
                        gmk = GMK.A02;
                    }
                    GM4 gm4 = new GM4(gmk, numValueOf7.intValue());
                    Hp7 hp7A024 = A02(gk2.keyValue_);
                    Integer num3 = gkv5.A04;
                    if (gm4.A01 != hp7A024.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gm4.A01()) {
                        if (num3 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num3 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new GMI(gm4, GME.A00(gm4, num3), hp7A024, num3);
                } catch (InvalidProtocolBufferException unused3) {
                    throw BV6.A0u("Parsing AesGcmKey failed");
                }
            case 5:
                GKV gkv6 = (GKV) glj;
                if (!gkv6.A05.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    GK4 gk4 = (GK4) GHM.A01(gkv6.A02, HzL.A00(), GK4.DEFAULT_INSTANCE);
                    if (gk4.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int iA025 = gk4.keyValue_.A02();
                    if (iA025 != 16 && iA025 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", new Object[]{Integer.valueOf(iA025)});
                    }
                    Integer numValueOf8 = Integer.valueOf(iA025);
                    GKP gkp5 = gkv6.A01;
                    int iOrdinal5 = gkp5.ordinal();
                    if (iOrdinal5 == 1) {
                        gml = GML.A03;
                    } else if (iOrdinal5 == 4 || iOrdinal5 == 2) {
                        gml = GML.A01;
                    } else {
                        if (iOrdinal5 != 3) {
                            throw FGI.A0t(gkp5);
                        }
                        gml = GML.A02;
                    }
                    GM8 gm8 = new GM8(gml, numValueOf8.intValue());
                    Hp7 hp7A025 = A02(gk4.keyValue_);
                    Integer num4 = gkv6.A04;
                    if (gm8.A00 != hp7A025.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gm8.A01()) {
                        if (num4 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num4 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new HjH(gm8, GMF.A00(gm8, num4), hp7A025, num4);
                } catch (InvalidProtocolBufferException unused4) {
                    throw BV6.A0u("Parsing AesGcmSivKey failed");
                }
            case 6:
                GKV gkv7 = (GKV) glj;
                if (!gkv7.A05.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw C60O.A0i("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    GK0 gk0 = (GK0) GHM.A01(gkv7.A02, HzL.A00(), GK0.DEFAULT_INSTANCE);
                    if (gk0.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    GKP gkp6 = gkv7.A01;
                    int iOrdinal6 = gkp6.ordinal();
                    if (iOrdinal6 == 1) {
                        gmm = GMM.A03;
                    } else if (iOrdinal6 == 4 || iOrdinal6 == 2) {
                        gmm = GMM.A01;
                    } else {
                        if (iOrdinal6 != 3) {
                            throw FGI.A0t(gkp6);
                        }
                        gmm = GMM.A02;
                    }
                    return C9508GLz.A01(gmm, A02(gk0.keyValue_), gkv7.A04);
                } catch (InvalidProtocolBufferException unused5) {
                    throw BV6.A0u("Parsing ChaCha20Poly1305Key failed");
                }
            case 7:
                GKV gkv8 = (GKV) glj;
                if (!gkv8.A05.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw C60O.A0i("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    GK8 gk8 = (GK8) GHM.A01(gkv8.A02, HzL.A00(), GK8.DEFAULT_INSTANCE);
                    if (gk8.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    AbstractC9321GEc abstractC9321GEc = gk8.keyValue_;
                    if (abstractC9321GEc.A02() != 32) {
                        throw BV6.A0u("Only 32 byte key size is accepted");
                    }
                    GKP gkp7 = gkv8.A01;
                    int iOrdinal7 = gkp7.ordinal();
                    if (iOrdinal7 == 1) {
                        gmr = GMR.A02;
                    } else {
                        if (iOrdinal7 != 3) {
                            throw FGI.A0t(gkp7);
                        }
                        gmr = GMR.A01;
                    }
                    GJU gju = gk8.params_;
                    if (gju == null) {
                        gju = GJU.DEFAULT_INSTANCE;
                    }
                    int i4 = gju.saltSize_;
                    if (i4 < 8 || i4 > 12) {
                        throw BV6.A0u("Salt size must be between 8 and 12 bytes");
                    }
                    return C9507GLy.A01(new GMC(gmr, i4), A02(abstractC9321GEc), gkv8.A04);
                } catch (InvalidProtocolBufferException unused6) {
                    throw BV6.A0u("Parsing XAesGcmKey failed");
                }
            case 8:
                GKV gkv9 = (GKV) glj;
                if (!gkv9.A05.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw C60O.A0i("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    GK6 gk6 = (GK6) GHM.A01(gkv9.A02, HzL.A00(), GK6.DEFAULT_INSTANCE);
                    if (gk6.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    GKP gkp8 = gkv9.A01;
                    int iOrdinal8 = gkp8.ordinal();
                    if (iOrdinal8 == 1) {
                        gmo = GMO.A03;
                    } else if (iOrdinal8 == 4 || iOrdinal8 == 2) {
                        gmo = GMO.A01;
                    } else {
                        if (iOrdinal8 != 3) {
                            throw FGI.A0t(gkp8);
                        }
                        gmo = GMO.A02;
                    }
                    return GM0.A01(gmo, A02(gk6.keyValue_), gkv9.A04);
                } catch (InvalidProtocolBufferException unused7) {
                    throw BV6.A0u("Parsing XChaCha20Poly1305Key failed");
                }
            case 9:
                GKV gkv10 = (GKV) glj;
                if (!gkv10.A05.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesSivParameters.parseParameters");
                }
                try {
                    C9456GJy c9456GJy = (C9456GJy) GHM.A01(gkv10.A02, HzL.A00(), C9456GJy.DEFAULT_INSTANCE);
                    if (c9456GJy.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int iA026 = c9456GJy.keyValue_.A02();
                    if (iA026 != 32 && iA026 != 48 && iA026 != 64) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", new Object[]{Integer.valueOf(iA026)});
                    }
                    Integer numValueOf9 = Integer.valueOf(iA026);
                    GKP gkp9 = gkv10.A01;
                    Map<GKP, C9486GLc> map2 = AbstractC9488GLe.A04;
                    if (!map2.containsKey(gkp9)) {
                        throw FGI.A0t(gkp9);
                    }
                    C9486GLc c9486GLc = map2.get(gkp9);
                    if (c9486GLc == null) {
                        throw BV6.A0u("Variant is not set");
                    }
                    C9490GLg c9490GLg = new C9490GLg(c9486GLc, numValueOf9.intValue());
                    Hp7 hp7A026 = A02(c9456GJy.keyValue_);
                    Integer num5 = gkv10.A04;
                    if (c9490GLg.A00 != hp7A026.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (c9490GLg.A01()) {
                        if (num5 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num5 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new C9492GLi(c9490GLg, AbstractC9491GLh.A00(c9490GLg, num5), hp7A026, num5);
                } catch (InvalidProtocolBufferException unused8) {
                    throw BV6.A0u("Parsing AesSivKey failed");
                }
            case 10:
                GKV gkv11 = (GKV) glj;
                if (!gkv11.A05.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw C60O.A0i("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    C9454GJw c9454GJw = (C9454GJw) GHM.A01(gkv11.A02, HzL.A00(), C9454GJw.DEFAULT_INSTANCE);
                    if (c9454GJw.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int iA027 = c9454GJw.keyValue_.A02();
                    if (iA027 != 16 && iA027 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(iA027 * 8)});
                    }
                    Integer numValueOf10 = Integer.valueOf(iA027);
                    C9438GJc c9438GJc = c9454GJw.params_;
                    if (c9438GJc == null) {
                        c9438GJc = C9438GJc.DEFAULT_INSTANCE;
                    }
                    int i5 = c9438GJc.tagSize_;
                    if (i5 < 10 || 16 < i5) {
                        throw FGI.A0u("Invalid tag size for AesCmacParameters: ", i5);
                    }
                    GLV glv = new GLV(GLU.A00(gkv11.A01), numValueOf10.intValue(), Integer.valueOf(i5).intValue());
                    Hp7 hp7A027 = A02(c9454GJw.keyValue_);
                    Integer num6 = gkv11.A04;
                    if (glv.A00 != hp7A027.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (glv.A01()) {
                        if (num6 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num6 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new Htd(glv, GLX.A00(glv, num6), hp7A027, num6);
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused9) {
                    throw BV6.A0u("Parsing AesCmacKey failed");
                }
            case 11:
                GKV gkv12 = (GKV) glj;
                if (!gkv12.A05.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw C60O.A0i("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    GKE gke6 = (GKE) GHM.A01(gkv12.A02, HzL.A00(), GKE.DEFAULT_INSTANCE);
                    if (gke6.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    Integer numValueOf11 = Integer.valueOf(gke6.keyValue_.A02());
                    GKJ gkj3 = gke6.params_;
                    GKJ gkj4 = gkj3;
                    if (gkj3 == null) {
                        gkj3 = GKJ.DEFAULT_INSTANCE;
                    }
                    Integer numValueOf12 = Integer.valueOf(gkj3.tagSize_);
                    GLY<GKK, GLL> gly = GLN.A00;
                    if (gkj4 == null) {
                        gkj4 = GKJ.DEFAULT_INSTANCE;
                    }
                    GKK gkkA0F = gkj4.A0F();
                    GLL gll = gly.A00.get(gkkA0F);
                    if (gll == null) {
                        throw AbstractC7611F5y.A0a(gkkA0F, "Unable to convert proto enum: ");
                    }
                    GLL gll2 = gll;
                    GLY<GKP, C9484GLa> gly2 = GLN.A01;
                    GKP gkp10 = gkv12.A01;
                    C9484GLa c9484GLa = gly2.A00.get(gkp10);
                    if (c9484GLa == null) {
                        throw AbstractC7611F5y.A0a(gkp10, "Unable to convert proto enum: ");
                    }
                    GLO gloA00 = GLM.A00(gll2, c9484GLa, numValueOf11, numValueOf12);
                    Hp7 hp7A028 = A02(gke6.keyValue_);
                    Integer num7 = gkv12.A04;
                    if (gloA00.A00 != hp7A028.A00.A00.length) {
                        throw BV6.A0u("Key size mismatch");
                    }
                    if (gloA00.A01()) {
                        if (num7 == null) {
                            throw AbstractC7608F5v.A0z();
                        }
                    } else if (num7 != null) {
                        throw AbstractC7608F5v.A10();
                    }
                    return new Ho4(gloA00, GLP.A00(gloA00, num7), hp7A028, num7);
                } catch (InvalidProtocolBufferException | IllegalArgumentException unused10) {
                    throw BV6.A0u("Parsing HmacKey failed");
                }
            default:
                return null;
        }
    }

    public final <SerializationT extends GLJ> GKQ A05(SerializationT serializedParameters) throws Throwable {
        GMO gmo;
        GMR gmr;
        GMM gmm;
        GML gml;
        GMK gmk;
        C9480GKw c9480GKw;
        C9479GKv c9479GKv;
        GMP gmp;
        GL5 gl5 = this.A00.get();
        Hqs hqs = new Hqs(serializedParameters.AIC(), serializedParameters.getClass());
        Map<Hqs, GLD<?>> map = gl5.A02;
        if (!map.containsKey(hqs)) {
            throw AbstractC7610F5x.A14(" available", C3cG.A0f(hqs, "No Parameters Parser for requested key type "));
        }
        switch (((C8934Ftq) map.get(hqs).A01).$t) {
            case 0:
                GJL gjl = ((GKZ) serializedParameters).A00;
                String str = gjl.typeUrl_;
                if (!str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    throw C60Q.A0U("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", str);
                }
                try {
                    String str2 = ((GJD) GHM.A01(gjl.value_, HzL.A00(), GJD.DEFAULT_INSTANCE)).keyUri_;
                    GKP gkpA0F = gjl.A0F();
                    int iOrdinal = gkpA0F.ordinal();
                    if (iOrdinal == 1) {
                        gmp = GMP.A02;
                    } else {
                        if (iOrdinal != 3) {
                            throw FGI.A0t(gkpA0F);
                        }
                        gmp = GMP.A01;
                    }
                    return new GMD(gmp, str2);
                } catch (InvalidProtocolBufferException e) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
                }
            case 1:
                GJL gjl2 = ((GKZ) serializedParameters).A00;
                String str3 = gjl2.typeUrl_;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw C60Q.A0U("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ", str3);
                }
                try {
                    return AbstractC9501GLr.A00((GJQ) GHM.A01(gjl2.value_, HzL.A00(), GJQ.DEFAULT_INSTANCE), gjl2.A0F());
                } catch (InvalidProtocolBufferException e2) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e2);
                }
            case 2:
                GJL gjl3 = ((GKZ) serializedParameters).A00;
                String str4 = gjl3.typeUrl_;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", str4);
                }
                try {
                    GKI gki = (GKI) GHM.A01(gjl3.value_, HzL.A00(), GKI.DEFAULT_INSTANCE);
                    GKG gkg = gki.hmacKeyFormat_;
                    GKG gkg2 = gkg;
                    if (gkg == null) {
                        gkg = GKG.DEFAULT_INSTANCE;
                    }
                    if (gkg.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    C9450GJs c9450GJs = gki.aesCtrKeyFormat_;
                    C9450GJs c9450GJs2 = c9450GJs;
                    if (c9450GJs == null) {
                        c9450GJs = C9450GJs.DEFAULT_INSTANCE;
                    }
                    int i = c9450GJs.keySize_;
                    if (i != 16 && i != 24 && i != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", BV5.A1Y(i));
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    GKG gkg3 = gkg2;
                    if (gkg2 == null) {
                        gkg3 = GKG.DEFAULT_INSTANCE;
                    }
                    int i2 = gkg3.keySize_;
                    Integer numValueOf2 = Integer.valueOf(i2);
                    if (i2 < 16) {
                        throw AbstractC7609F5w.A0w("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", new Object[]{numValueOf2});
                    }
                    if (c9450GJs2 == null) {
                        c9450GJs2 = C9450GJs.DEFAULT_INSTANCE;
                    }
                    C9436GJa c9436GJa = c9450GJs2.params_;
                    if (c9436GJa == null) {
                        c9436GJa = C9436GJa.DEFAULT_INSTANCE;
                    }
                    int i3 = c9436GJa.ivSize_;
                    if (i3 < 12 || i3 > 16) {
                        throw AbstractC7609F5w.A0v("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", BV5.A1Y(i3));
                    }
                    Integer numValueOf3 = Integer.valueOf(i3);
                    GKG gkg4 = gkg2;
                    if (gkg2 == null) {
                        gkg4 = GKG.DEFAULT_INSTANCE;
                    }
                    GKJ gkj = gkg4.params_;
                    if (gkj == null) {
                        gkj = GKJ.DEFAULT_INSTANCE;
                    }
                    int i4 = gkj.tagSize_;
                    Integer numValueOf4 = Integer.valueOf(i4);
                    if (i4 < 10) {
                        throw AbstractC7609F5w.A0v("Invalid tag size in bytes %d; must be at least 10 bytes", new Object[]{numValueOf4});
                    }
                    if (gkg2 == null) {
                        gkg2 = GKG.DEFAULT_INSTANCE;
                    }
                    GKJ gkj2 = gkg2.params_;
                    if (gkj2 == null) {
                        gkj2 = GKJ.DEFAULT_INSTANCE;
                    }
                    GL4 gl4A00 = AbstractC9481GKx.A00(gkj2.A0F());
                    GKP gkpA0F2 = gjl3.A0F();
                    int iOrdinal2 = gkpA0F2.ordinal();
                    if (iOrdinal2 == 1) {
                        c9479GKv = C9479GKv.A03;
                    } else if (iOrdinal2 == 4 || iOrdinal2 == 2) {
                        c9479GKv = C9479GKv.A01;
                    } else {
                        if (iOrdinal2 != 3) {
                            throw FGI.A0t(gkpA0F2);
                        }
                        c9479GKv = C9479GKv.A02;
                    }
                    return GL3.A00(gl4A00, c9479GKv, numValueOf, numValueOf2, numValueOf3, numValueOf4);
                } catch (InvalidProtocolBufferException e3) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e3);
                }
            case 3:
                GJL gjl4 = ((GKZ) serializedParameters).A00;
                String str5 = gjl4.typeUrl_;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ", str5);
                }
                try {
                    C9452GJu c9452GJu = (C9452GJu) GHM.A01(gjl4.value_, HzL.A00(), C9452GJu.DEFAULT_INSTANCE);
                    int i5 = c9452GJu.keySize_;
                    if (i5 != 16 && i5 != 24 && i5 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", BV5.A1Y(i5));
                    }
                    Integer numValueOf5 = Integer.valueOf(i5);
                    GJY gjy = c9452GJu.params_;
                    if (gjy == null) {
                        gjy = GJY.DEFAULT_INSTANCE;
                    }
                    int i6 = gjy.ivSize_;
                    if (i6 != 12 && i6 != 16) {
                        throw AbstractC7609F5w.A0v("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", BV5.A1Y(i6));
                    }
                    Integer numValueOf6 = Integer.valueOf(i6);
                    GKP gkpA0F3 = gjl4.A0F();
                    int iOrdinal3 = gkpA0F3.ordinal();
                    if (iOrdinal3 == 1) {
                        c9480GKw = C9480GKw.A03;
                    } else if (iOrdinal3 == 4 || iOrdinal3 == 2) {
                        c9480GKw = C9480GKw.A01;
                    } else {
                        if (iOrdinal3 != 3) {
                            throw FGI.A0t(gkpA0F3);
                        }
                        c9480GKw = C9480GKw.A02;
                    }
                    return new GL0(c9480GKw, numValueOf5.intValue(), numValueOf6.intValue());
                } catch (InvalidProtocolBufferException e4) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e4);
                }
            case 4:
                GJL gjl5 = ((GKZ) serializedParameters).A00;
                String str6 = gjl5.typeUrl_;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", str6);
                }
                try {
                    C9444GJm c9444GJm = (C9444GJm) GHM.A01(gjl5.value_, HzL.A00(), C9444GJm.DEFAULT_INSTANCE);
                    if (c9444GJm.version_ != 0) {
                        throw BV6.A0u("Only version 0 parameters are accepted");
                    }
                    int i7 = c9444GJm.keySize_;
                    if (i7 != 16 && i7 != 24 && i7 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", BV5.A1Y(i7));
                    }
                    Integer numValueOf7 = Integer.valueOf(i7);
                    GKP gkpA0F4 = gjl5.A0F();
                    int iOrdinal4 = gkpA0F4.ordinal();
                    if (iOrdinal4 == 1) {
                        gmk = GMK.A03;
                    } else if (iOrdinal4 == 4 || iOrdinal4 == 2) {
                        gmk = GMK.A01;
                    } else {
                        if (iOrdinal4 != 3) {
                            throw FGI.A0t(gkpA0F4);
                        }
                        gmk = GMK.A02;
                    }
                    return new GM4(gmk, numValueOf7.intValue());
                } catch (InvalidProtocolBufferException e5) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e5);
                }
            case 5:
                GJL gjl6 = ((GKZ) serializedParameters).A00;
                String str7 = gjl6.typeUrl_;
                if (!str7.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", str7);
                }
                try {
                    C9446GJo c9446GJo = (C9446GJo) GHM.A01(gjl6.value_, HzL.A00(), C9446GJo.DEFAULT_INSTANCE);
                    if (c9446GJo.version_ != 0) {
                        throw BV6.A0u("Only version 0 parameters are accepted");
                    }
                    int i8 = c9446GJo.keySize_;
                    if (i8 != 16 && i8 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", BV5.A1Y(i8));
                    }
                    Integer numValueOf8 = Integer.valueOf(i8);
                    GKP gkpA0F5 = gjl6.A0F();
                    int iOrdinal5 = gkpA0F5.ordinal();
                    if (iOrdinal5 == 1) {
                        gml = GML.A03;
                    } else if (iOrdinal5 == 4 || iOrdinal5 == 2) {
                        gml = GML.A01;
                    } else {
                        if (iOrdinal5 != 3) {
                            throw FGI.A0t(gkpA0F5);
                        }
                        gml = GML.A02;
                    }
                    return new GM8(gml, numValueOf8.intValue());
                } catch (InvalidProtocolBufferException e6) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e6);
                }
            case 6:
                GJL gjl7 = ((GKZ) serializedParameters).A00;
                String str8 = gjl7.typeUrl_;
                if (!str8.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw C60Q.A0U("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ", str8);
                }
                try {
                    GHM.A01(gjl7.value_, HzL.A00(), C9428GIs.DEFAULT_INSTANCE);
                    GKP gkpA0F6 = gjl7.A0F();
                    int iOrdinal6 = gkpA0F6.ordinal();
                    if (iOrdinal6 == 1) {
                        gmm = GMM.A03;
                    } else if (iOrdinal6 == 4 || iOrdinal6 == 2) {
                        gmm = GMM.A01;
                    } else {
                        if (iOrdinal6 != 3) {
                            throw FGI.A0t(gkpA0F6);
                        }
                        gmm = GMM.A02;
                    }
                    return new GMG(gmm);
                } catch (InvalidProtocolBufferException e7) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e7);
                }
            case 7:
                GJL gjl8 = ((GKZ) serializedParameters).A00;
                String str9 = gjl8.typeUrl_;
                if (!str9.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw C60Q.A0U("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ", str9);
                }
                try {
                    C9440GJe c9440GJe = (C9440GJe) GHM.A01(gjl8.value_, HzL.A00(), C9440GJe.DEFAULT_INSTANCE);
                    if (c9440GJe.version_ != 0) {
                        throw BV6.A0u("Only version 0 parameters are accepted");
                    }
                    GKP gkpA0F7 = gjl8.A0F();
                    int iOrdinal7 = gkpA0F7.ordinal();
                    if (iOrdinal7 == 1) {
                        gmr = GMR.A02;
                    } else {
                        if (iOrdinal7 != 3) {
                            throw FGI.A0t(gkpA0F7);
                        }
                        gmr = GMR.A01;
                    }
                    GJU gju = c9440GJe.params_;
                    if (gju == null) {
                        gju = GJU.DEFAULT_INSTANCE;
                    }
                    int i9 = gju.saltSize_;
                    if (i9 < 8 || i9 > 12) {
                        throw BV6.A0u("Salt size must be between 8 and 12 bytes");
                    }
                    return new GMC(gmr, i9);
                } catch (InvalidProtocolBufferException e8) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e8);
                }
            case 8:
                GJL gjl9 = ((GKZ) serializedParameters).A00;
                String str10 = gjl9.typeUrl_;
                if (!str10.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw C60Q.A0U("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", str10);
                }
                try {
                    if (((GJW) GHM.A01(gjl9.value_, HzL.A00(), GJW.DEFAULT_INSTANCE)).version_ != 0) {
                        throw BV6.A0u("Only version 0 parameters are accepted");
                    }
                    GKP gkpA0F8 = gjl9.A0F();
                    int iOrdinal8 = gkpA0F8.ordinal();
                    if (iOrdinal8 == 1) {
                        gmo = GMO.A03;
                    } else if (iOrdinal8 == 4 || iOrdinal8 == 2) {
                        gmo = GMO.A01;
                    } else {
                        if (iOrdinal8 != 3) {
                            throw FGI.A0t(gkpA0F8);
                        }
                        gmo = GMO.A02;
                    }
                    return new GMH(gmo);
                } catch (InvalidProtocolBufferException e9) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e9);
                }
            case 9:
                GJL gjl10 = ((GKZ) serializedParameters).A00;
                String str11 = gjl10.typeUrl_;
                if (!str11.equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesSivParameters.parseParameters: ", str11);
                }
                try {
                    C9448GJq c9448GJq = (C9448GJq) GHM.A01(gjl10.value_, HzL.A00(), C9448GJq.DEFAULT_INSTANCE);
                    if (c9448GJq.version_ != 0) {
                        throw BV6.A0u("Only version 0 keys are accepted");
                    }
                    int i10 = c9448GJq.keySize_;
                    if (i10 != 32 && i10 != 48 && i10 != 64) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", BV5.A1Y(i10));
                    }
                    Integer numValueOf9 = Integer.valueOf(i10);
                    GKP gkpA0F9 = gjl10.A0F();
                    Map<GKP, C9486GLc> map2 = AbstractC9488GLe.A04;
                    if (!map2.containsKey(gkpA0F9)) {
                        throw FGI.A0t(gkpA0F9);
                    }
                    C9486GLc c9486GLc = map2.get(gkpA0F9);
                    if (c9486GLc != null) {
                        return new C9490GLg(c9486GLc, numValueOf9.intValue());
                    }
                    throw BV6.A0u("Variant is not set");
                } catch (InvalidProtocolBufferException e10) {
                    throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e10);
                }
            case 10:
                GJL gjl11 = ((GKZ) serializedParameters).A00;
                String str12 = gjl11.typeUrl_;
                if (!str12.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw C60Q.A0U("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", str12);
                }
                try {
                    GJk gJk = (GJk) GHM.A01(gjl11.value_, HzL.A00(), GJk.DEFAULT_INSTANCE);
                    int i11 = gJk.keySize_;
                    if (i11 != 16 && i11 != 32) {
                        throw AbstractC7609F5w.A0w("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", BV5.A1Y(i11 * 8));
                    }
                    Integer numValueOf10 = Integer.valueOf(i11);
                    C9438GJc c9438GJc = gJk.params_;
                    if (c9438GJc == null) {
                        c9438GJc = C9438GJc.DEFAULT_INSTANCE;
                    }
                    int i12 = c9438GJc.tagSize_;
                    if (i12 < 10 || 16 < i12) {
                        throw FGI.A0u("Invalid tag size for AesCmacParameters: ", i12);
                    }
                    return new GLV(GLU.A00(gjl11.A0F()), numValueOf10.intValue(), Integer.valueOf(i12).intValue());
                } catch (InvalidProtocolBufferException e11) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e11);
                }
            case 11:
                GJL gjl12 = ((GKZ) serializedParameters).A00;
                String str13 = gjl12.typeUrl_;
                if (!str13.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw C60Q.A0U("Wrong type URL in call to HmacProtoSerialization.parseParameters: ", str13);
                }
                try {
                    GKG gkg5 = (GKG) GHM.A01(gjl12.value_, HzL.A00(), GKG.DEFAULT_INSTANCE);
                    int i13 = gkg5.version_;
                    if (i13 != 0) {
                        throw FGI.A0u("Parsing HmacParameters failed: unknown Version ", i13);
                    }
                    Integer numValueOf11 = Integer.valueOf(gkg5.keySize_);
                    GKJ gkj3 = gkg5.params_;
                    GKJ gkj4 = gkj3;
                    if (gkj3 == null) {
                        gkj3 = GKJ.DEFAULT_INSTANCE;
                    }
                    Integer numValueOf12 = Integer.valueOf(gkj3.tagSize_);
                    GLY<GKK, GLL> gly = GLN.A00;
                    if (gkj4 == null) {
                        gkj4 = GKJ.DEFAULT_INSTANCE;
                    }
                    GKK gkkA0F = gkj4.A0F();
                    GLL gll = gly.A00.get(gkkA0F);
                    if (gll == null) {
                        throw AbstractC7611F5y.A0a(gkkA0F, "Unable to convert proto enum: ");
                    }
                    GLL gll2 = gll;
                    GLY<GKP, C9484GLa> gly2 = GLN.A01;
                    GKP gkpA0F10 = gjl12.A0F();
                    C9484GLa c9484GLa = gly2.A00.get(gkpA0F10);
                    if (c9484GLa != null) {
                        return GLM.A00(gll2, c9484GLa, numValueOf11, numValueOf12);
                    }
                    throw AbstractC7611F5y.A0a(gkpA0F10, "Unable to convert proto enum: ");
                } catch (InvalidProtocolBufferException e12) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e12);
                }
            default:
                return null;
        }
    }

    public final GLJ A06(AbstractC9465GKh abstractC9465GKh) throws GeneralSecurityException {
        C9324GEf c9324GEfA00;
        GJO gjo;
        GKP gkpA01;
        Integer num;
        String str;
        GL5 gl5 = this.A00.get();
        Ho7 ho7 = new Ho7(abstractC9465GKh.getClass(), GKV.class);
        Map<Ho7, GLF<?, ?>> map = gl5.A01;
        if (!map.containsKey(ho7)) {
            throw AbstractC7610F5x.A14(" available", C3cG.A0f(ho7, "No Key serializer for "));
        }
        switch (((C8930Ftm) map.get(ho7).A01).$t) {
            case 0:
                GM1 gm1 = (GM1) abstractC9465GKh;
                C9442GJg c9442GJg = C9442GJg.DEFAULT_INSTANCE;
                Integer num2 = C79.A0P;
                GHW ghwA0A = GHS.A0A(c9442GJg, num2);
                GHW ghwA0A2 = GHS.A0A(GJD.DEFAULT_INSTANCE, num2);
                GMD gmd = gm1.A00;
                String str2 = gmd.A01;
                GJD gjd = (GJD) GHW.A00(ghwA0A2);
                str2.getClass();
                gjd.keyUri_ = str2;
                GJD gjd2 = (GJD) ghwA0A2.A02();
                C9442GJg c9442GJg2 = (C9442GJg) GHW.A00(ghwA0A);
                gjd2.getClass();
                c9442GJg2.params_ = gjd2;
                c9442GJg2.bitField0_ |= 1;
                c9324GEfA00 = A00(ghwA0A);
                gjo = GJO.REMOTE;
                GMP gmp = gmd.A00;
                if (GMP.A02.equals(gmp)) {
                    gkpA01 = GKP.TINK;
                } else {
                    if (!GMP.A01.equals(gmp)) {
                        throw AbstractC7611F5y.A0a(gmp, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                }
                num = gm1.A02;
                str = "type.googleapis.com/google.crypto.tink.KmsAeadKey";
                break;
            case 1:
                GM2 gm2 = (GM2) abstractC9465GKh;
                GHW ghwA09 = GHS.A09(GJi.DEFAULT_INSTANCE);
                GMB gmb = gm2.A00;
                GJQ gjqA01 = AbstractC9501GLr.A01(gmb);
                GJi gJi = (GJi) GHW.A00(ghwA09);
                gjqA01.getClass();
                gJi.params_ = gjqA01;
                gJi.bitField0_ |= 1;
                c9324GEfA00 = A00(ghwA09);
                gjo = GJO.REMOTE;
                GMQ gmq = gmb.A01;
                if (GMQ.A02.equals(gmq)) {
                    gkpA01 = GKP.TINK;
                } else {
                    if (!GMQ.A01.equals(gmq)) {
                        throw AbstractC7611F5y.A0a(gmq, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                }
                num = gm2.A02;
                str = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
                break;
            case 2:
                C10536Hqh c10536Hqh = (C10536Hqh) abstractC9465GKh;
                GKH gkh = GKH.DEFAULT_INSTANCE;
                Integer num3 = C79.A0P;
                GHW ghwA0A3 = GHS.A0A(gkh, num3);
                GHW ghwA0A4 = GHS.A0A(GKA.DEFAULT_INSTANCE, num3);
                GHW ghwA0A5 = GHS.A0A(C9436GJa.DEFAULT_INSTANCE, num3);
                C9483GKz c9483GKz = c10536Hqh.A00;
                ((C9436GJa) GHW.A00(ghwA0A5)).ivSize_ = c9483GKz.A02;
                C9436GJa c9436GJa = (C9436GJa) ghwA0A5.A02();
                GKA gka = (GKA) GHW.A00(ghwA0A4);
                c9436GJa.getClass();
                gka.params_ = c9436GJa;
                gka.bitField0_ |= 1;
                byte[] bArrA01 = c10536Hqh.A02.A00.A01();
                ((GKA) GHW.A00(ghwA0A4)).keyValue_ = AbstractC9321GEc.A01(bArrA01, 0, bArrA01.length);
                GKA gka2 = (GKA) ghwA0A4.A02();
                GKH gkh2 = (GKH) GHW.A00(ghwA0A3);
                gka2.getClass();
                gkh2.aesCtrKey_ = gka2;
                gkh2.bitField0_ |= 1;
                GHW ghwA0A6 = GHS.A0A(GKE.DEFAULT_INSTANCE, num3);
                GKJ gkjA01 = AbstractC9481GKx.A01(c9483GKz);
                GKE gke = (GKE) GHW.A00(ghwA0A6);
                gkjA01.getClass();
                gke.params_ = gkjA01;
                gke.bitField0_ |= 1;
                byte[] bArrA012 = c10536Hqh.A03.A00.A01();
                ((GKE) GHW.A00(ghwA0A6)).keyValue_ = AbstractC9321GEc.A01(bArrA012, 0, bArrA012.length);
                GKE gke2 = (GKE) ghwA0A6.A02();
                GKH gkh3 = (GKH) GHW.A00(ghwA0A3);
                gke2.getClass();
                gkh3.hmacKey_ = gke2;
                gkh3.bitField0_ |= 2;
                c9324GEfA00 = A00(ghwA0A3);
                gjo = GJO.SYMMETRIC;
                gkpA01 = AbstractC9481GKx.A02(c9483GKz.A05);
                num = c10536Hqh.A04;
                str = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
                break;
            case 3:
                Hnc hnc = (Hnc) abstractC9465GKh;
                GHW ghwA092 = GHS.A09(GKC.DEFAULT_INSTANCE);
                GL0 gl0 = hnc.A00;
                GJY gjyA00 = AbstractC9482GKy.A00(gl0);
                GKC gkc = (GKC) GHW.A00(ghwA092);
                gjyA00.getClass();
                gkc.params_ = gjyA00;
                gkc.bitField0_ |= 1;
                ((GKC) ghwA092.A00).keyValue_ = A01(ghwA092, hnc.A02);
                c9324GEfA00 = A00(ghwA092);
                gjo = GJO.SYMMETRIC;
                gkpA01 = AbstractC9482GKy.A01(gl0.A03);
                num = hnc.A03;
                str = "type.googleapis.com/google.crypto.tink.AesEaxKey";
                break;
            case 4:
                GMI gmi = (GMI) abstractC9465GKh;
                GM4 gm4 = gmi.A00;
                AbstractC9500GLq.A01(gm4);
                GHW ghwA093 = GHS.A09(GK2.DEFAULT_INSTANCE);
                ((GK2) ghwA093.A00).keyValue_ = A01(ghwA093, gmi.A02);
                c9324GEfA00 = A00(ghwA093);
                gjo = GJO.SYMMETRIC;
                gkpA01 = AbstractC9500GLq.A00(gm4.A03);
                num = gmi.A03;
                str = "type.googleapis.com/google.crypto.tink.AesGcmKey";
                break;
            case 5:
                HjH hjH = (HjH) abstractC9465GKh;
                GHW ghwA094 = GHS.A09(GK4.DEFAULT_INSTANCE);
                ((GK4) ghwA094.A00).keyValue_ = A01(ghwA094, hjH.A02);
                c9324GEfA00 = A00(ghwA094);
                gjo = GJO.SYMMETRIC;
                gkpA01 = GLs.A00(hjH.A00.A01);
                num = hjH.A03;
                str = "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
                break;
            case 6:
                C9508GLz c9508GLz = (C9508GLz) abstractC9465GKh;
                GHW ghwA095 = GHS.A09(GK0.DEFAULT_INSTANCE);
                ((GK0) ghwA095.A00).keyValue_ = A01(ghwA095, c9508GLz.A02);
                c9324GEfA00 = A00(ghwA095);
                gjo = GJO.SYMMETRIC;
                gkpA01 = AbstractC9502GLt.A00(c9508GLz.A00.A00);
                num = c9508GLz.A03;
                str = "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
                break;
            case 7:
                C9507GLy c9507GLy = (C9507GLy) abstractC9465GKh;
                GK8 gk8 = GK8.DEFAULT_INSTANCE;
                Integer num4 = C79.A0P;
                GHW ghwA0A7 = GHS.A0A(gk8, num4);
                ((GK8) ghwA0A7.A00).keyValue_ = A01(ghwA0A7, c9507GLy.A02);
                GHW ghwA0A8 = GHS.A0A(GJU.DEFAULT_INSTANCE, num4);
                GMC gmc = c9507GLy.A00;
                ((GJU) GHW.A00(ghwA0A8)).saltSize_ = gmc.A00;
                GJU gju = (GJU) ghwA0A8.A02();
                GK8 gk82 = (GK8) GHW.A00(ghwA0A7);
                gju.getClass();
                gk82.params_ = gju;
                gk82.bitField0_ |= 1;
                c9324GEfA00 = A00(ghwA0A7);
                gjo = GJO.SYMMETRIC;
                GMR gmr = gmc.A01;
                if (C6xC.A00(gmr, GMR.A02)) {
                    gkpA01 = GKP.TINK;
                } else {
                    if (!C6xC.A00(gmr, GMR.A01)) {
                        throw AbstractC7611F5y.A0a(gmr, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                }
                num = c9507GLy.A03;
                str = "type.googleapis.com/google.crypto.tink.XAesGcmKey";
                break;
            case 8:
                GM0 gm0 = (GM0) abstractC9465GKh;
                GHW ghwA096 = GHS.A09(GK6.DEFAULT_INSTANCE);
                ((GK6) ghwA096.A00).keyValue_ = A01(ghwA096, gm0.A02);
                c9324GEfA00 = A00(ghwA096);
                gjo = GJO.SYMMETRIC;
                gkpA01 = AbstractC9503GLu.A00(gm0.A00.A00);
                num = gm0.A03;
                str = "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
                break;
            case 9:
                C9492GLi c9492GLi = (C9492GLi) abstractC9465GKh;
                GHW ghwA097 = GHS.A09(C9456GJy.DEFAULT_INSTANCE);
                ((C9456GJy) ghwA097.A00).keyValue_ = A01(ghwA097, c9492GLi.A02);
                c9324GEfA00 = A00(ghwA097);
                gjo = GJO.SYMMETRIC;
                C9486GLc c9486GLc = c9492GLi.A00.A01;
                Map<C9486GLc, GKP> map2 = AbstractC9488GLe.A05;
                if (!map2.containsKey(c9486GLc)) {
                    throw AbstractC7611F5y.A0a(c9486GLc, "Unable to serialize variant: ");
                }
                gkpA01 = map2.get(c9486GLc);
                num = c9492GLi.A03;
                str = "type.googleapis.com/google.crypto.tink.AesSivKey";
                break;
            case 10:
                return ((C9475GKr) abstractC9465GKh).A00;
            case 11:
                Htd htd = (Htd) abstractC9465GKh;
                C9454GJw c9454GJw = C9454GJw.DEFAULT_INSTANCE;
                Integer num5 = C79.A0P;
                GHW ghwA0A9 = GHS.A0A(c9454GJw, num5);
                GLV glv = htd.A00;
                GHW ghwA0A10 = GHS.A0A(C9438GJc.DEFAULT_INSTANCE, num5);
                ((C9438GJc) GHW.A00(ghwA0A10)).tagSize_ = glv.A01;
                C9438GJc c9438GJc = (C9438GJc) ghwA0A10.A02();
                C9454GJw c9454GJw2 = (C9454GJw) GHW.A00(ghwA0A9);
                c9438GJc.getClass();
                c9454GJw2.params_ = c9438GJc;
                c9454GJw2.bitField0_ |= 1;
                ((C9454GJw) ghwA0A9.A00).keyValue_ = A01(ghwA0A9, htd.A02);
                c9324GEfA00 = A00(ghwA0A9);
                gjo = GJO.SYMMETRIC;
                gkpA01 = GLU.A01(glv.A02);
                num = htd.A03;
                str = "type.googleapis.com/google.crypto.tink.AesCmacKey";
                break;
            case 12:
                Ho4 ho4 = (Ho4) abstractC9465GKh;
                GHW ghwA098 = GHS.A09(GKE.DEFAULT_INSTANCE);
                GLO glo = ho4.A00;
                GKJ gkjA00 = GLN.A00(glo);
                GKE gke3 = (GKE) GHW.A00(ghwA098);
                gkjA00.getClass();
                gke3.params_ = gkjA00;
                gke3.bitField0_ |= 1;
                ((GKE) ghwA098.A00).keyValue_ = A01(ghwA098, ho4.A02);
                c9324GEfA00 = A00(ghwA098);
                gjo = GJO.SYMMETRIC;
                GLY<GKP, C9484GLa> gly = GLN.A01;
                C9484GLa c9484GLa = glo.A03;
                Enum r2 = (Enum) gly.A01.get(c9484GLa);
                if (r2 == null) {
                    throw AbstractC7611F5y.A0a(c9484GLa, "Unable to convert object enum: ");
                }
                gkpA01 = (GKP) r2;
                num = ho4.A03;
                str = "type.googleapis.com/google.crypto.tink.HmacKey";
                break;
            default:
                return null;
        }
        return GKV.A00(gjo, gkpA01, c9324GEfA00, num, str);
    }

    public final GLJ A07(GKQ gkq) throws GeneralSecurityException {
        GJM gjm;
        GKP gkpA01;
        GL5 gl5 = this.A00.get();
        Ho7 ho7 = new Ho7(gkq.getClass(), GKZ.class);
        Map<Ho7, GLB<?, ?>> map = gl5.A03;
        if (!map.containsKey(ho7)) {
            throw AbstractC7610F5x.A14(" available", C3cG.A0f(ho7, "No Key Format serializer for "));
        }
        switch (((C8929Ftl) map.get(ho7).A01).$t) {
            case 0:
                GMD gmd = (GMD) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.KmsAeadKey");
                GHW ghwA09 = GHS.A09(GJD.DEFAULT_INSTANCE);
                String str = gmd.A01;
                GJD gjd = (GJD) GHW.A00(ghwA09);
                str.getClass();
                gjd.keyUri_ = str;
                A03(gjm, ghwA09);
                GMP gmp = gmd.A00;
                if (!GMP.A02.equals(gmp)) {
                    if (!GMP.A01.equals(gmp)) {
                        throw AbstractC7611F5y.A0a(gmp, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                    gjm.A05(gkpA01);
                    GJL gjl = (GJL) gjm.A02();
                    return new GKZ(gjl, AbstractC10509Hny.A01(gjl.typeUrl_));
                }
                gkpA01 = GKP.TINK;
                gjm.A05(gkpA01);
                GJL gjl2 = (GJL) gjm.A02();
                return new GKZ(gjl2, AbstractC10509Hny.A01(gjl2.typeUrl_));
            case 1:
                GMB gmb = (GMB) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
                gjm.A06(AbstractC9501GLr.A01(gmb).A0C());
                GMQ gmq = gmb.A01;
                if (!GMQ.A02.equals(gmq)) {
                    if (!GMQ.A01.equals(gmq)) {
                        throw AbstractC7611F5y.A0a(gmq, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                    gjm.A05(gkpA01);
                    GJL gjl22 = (GJL) gjm.A02();
                    return new GKZ(gjl22, AbstractC10509Hny.A01(gjl22.typeUrl_));
                }
                gkpA01 = GKP.TINK;
                gjm.A05(gkpA01);
                GJL gjl222 = (GJL) gjm.A02();
                return new GKZ(gjl222, AbstractC10509Hny.A01(gjl222.typeUrl_));
            case 2:
                C9483GKz c9483GKz = (C9483GKz) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                GKI gki = GKI.DEFAULT_INSTANCE;
                Integer num = C79.A0P;
                GHW ghwA0A = GHS.A0A(gki, num);
                GHW ghwA0A2 = GHS.A0A(C9450GJs.DEFAULT_INSTANCE, num);
                GHW ghwA0A3 = GHS.A0A(C9436GJa.DEFAULT_INSTANCE, num);
                ((C9436GJa) GHW.A00(ghwA0A3)).ivSize_ = c9483GKz.A02;
                C9436GJa c9436GJa = (C9436GJa) ghwA0A3.A02();
                C9450GJs c9450GJs = (C9450GJs) GHW.A00(ghwA0A2);
                c9436GJa.getClass();
                c9450GJs.params_ = c9436GJa;
                c9450GJs.bitField0_ |= 1;
                ((C9450GJs) GHW.A00(ghwA0A2)).keySize_ = c9483GKz.A00;
                C9450GJs c9450GJs2 = (C9450GJs) ghwA0A2.A02();
                GKI gki2 = (GKI) GHW.A00(ghwA0A);
                c9450GJs2.getClass();
                gki2.aesCtrKeyFormat_ = c9450GJs2;
                gki2.bitField0_ |= 1;
                GHW ghwA0A4 = GHS.A0A(GKG.DEFAULT_INSTANCE, num);
                GKJ gkjA01 = AbstractC9481GKx.A01(c9483GKz);
                GKG gkg = (GKG) GHW.A00(ghwA0A4);
                gkjA01.getClass();
                gkg.params_ = gkjA01;
                gkg.bitField0_ |= 1;
                ((GKG) GHW.A00(ghwA0A4)).keySize_ = c9483GKz.A01;
                GKG gkg2 = (GKG) ghwA0A4.A02();
                GKI gki3 = (GKI) GHW.A00(ghwA0A);
                gkg2.getClass();
                gki3.hmacKeyFormat_ = gkg2;
                gki3.bitField0_ |= 2;
                A03(gjm, ghwA0A);
                gkpA01 = AbstractC9481GKx.A02(c9483GKz.A05);
                gjm.A05(gkpA01);
                GJL gjl2222 = (GJL) gjm.A02();
                return new GKZ(gjl2222, AbstractC10509Hny.A01(gjl2222.typeUrl_));
            case 3:
                GL0 gl0 = (GL0) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesEaxKey");
                GHW ghwA092 = GHS.A09(C9452GJu.DEFAULT_INSTANCE);
                GJY gjyA00 = AbstractC9482GKy.A00(gl0);
                C9452GJu c9452GJu = (C9452GJu) GHW.A00(ghwA092);
                gjyA00.getClass();
                c9452GJu.params_ = gjyA00;
                c9452GJu.bitField0_ |= 1;
                ((C9452GJu) GHW.A00(ghwA092)).keySize_ = gl0.A01;
                A03(gjm, ghwA092);
                gkpA01 = AbstractC9482GKy.A01(gl0.A03);
                gjm.A05(gkpA01);
                GJL gjl22222 = (GJL) gjm.A02();
                return new GKZ(gjl22222, AbstractC10509Hny.A01(gjl22222.typeUrl_));
            case 4:
                GM4 gm4 = (GM4) gkq;
                AbstractC9500GLq.A01(gm4);
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesGcmKey");
                GHW ghwA093 = GHS.A09(C9444GJm.DEFAULT_INSTANCE);
                ((C9444GJm) GHW.A00(ghwA093)).keySize_ = gm4.A01;
                A03(gjm, ghwA093);
                gkpA01 = AbstractC9500GLq.A00(gm4.A03);
                gjm.A05(gkpA01);
                GJL gjl222222 = (GJL) gjm.A02();
                return new GKZ(gjl222222, AbstractC10509Hny.A01(gjl222222.typeUrl_));
            case 5:
                GM8 gm8 = (GM8) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                GHW ghwA094 = GHS.A09(C9446GJo.DEFAULT_INSTANCE);
                ((C9446GJo) GHW.A00(ghwA094)).keySize_ = gm8.A00;
                A03(gjm, ghwA094);
                gkpA01 = GLs.A00(gm8.A01);
                gjm.A05(gkpA01);
                GJL gjl2222222 = (GJL) gjm.A02();
                return new GKZ(gjl2222222, AbstractC10509Hny.A01(gjl2222222.typeUrl_));
            case 6:
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                gjm.A06(C9428GIs.DEFAULT_INSTANCE.A0C());
                gkpA01 = AbstractC9502GLt.A00(((GMG) gkq).A00);
                gjm.A05(gkpA01);
                GJL gjl22222222 = (GJL) gjm.A02();
                return new GKZ(gjl22222222, AbstractC10509Hny.A01(gjl22222222.typeUrl_));
            case 7:
                GMC gmc = (GMC) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                C9440GJe c9440GJe = C9440GJe.DEFAULT_INSTANCE;
                Integer num2 = C79.A0P;
                GHW ghwA0A5 = GHS.A0A(c9440GJe, num2);
                GHW ghwA0A6 = GHS.A0A(GJU.DEFAULT_INSTANCE, num2);
                ((GJU) GHW.A00(ghwA0A6)).saltSize_ = gmc.A00;
                GJU gju = (GJU) ghwA0A6.A02();
                C9440GJe c9440GJe2 = (C9440GJe) GHW.A00(ghwA0A5);
                gju.getClass();
                c9440GJe2.params_ = gju;
                c9440GJe2.bitField0_ |= 1;
                A03(gjm, ghwA0A5);
                GMR gmr = gmc.A01;
                if (!C6xC.A00(gmr, GMR.A02)) {
                    if (!C6xC.A00(gmr, GMR.A01)) {
                        throw AbstractC7611F5y.A0a(gmr, "Unable to serialize variant: ");
                    }
                    gkpA01 = GKP.RAW;
                    gjm.A05(gkpA01);
                    GJL gjl222222222 = (GJL) gjm.A02();
                    return new GKZ(gjl222222222, AbstractC10509Hny.A01(gjl222222222.typeUrl_));
                }
                gkpA01 = GKP.TINK;
                gjm.A05(gkpA01);
                GJL gjl2222222222 = (GJL) gjm.A02();
                return new GKZ(gjl2222222222, AbstractC10509Hny.A01(gjl2222222222.typeUrl_));
            case 8:
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                gjm.A06(GJW.DEFAULT_INSTANCE.A0C());
                gkpA01 = AbstractC9503GLu.A00(((GMH) gkq).A00);
                gjm.A05(gkpA01);
                GJL gjl22222222222 = (GJL) gjm.A02();
                return new GKZ(gjl22222222222, AbstractC10509Hny.A01(gjl22222222222.typeUrl_));
            case 9:
                C9490GLg c9490GLg = (C9490GLg) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesSivKey");
                GHW ghwA095 = GHS.A09(C9448GJq.DEFAULT_INSTANCE);
                ((C9448GJq) GHW.A00(ghwA095)).keySize_ = c9490GLg.A00;
                A03(gjm, ghwA095);
                C9486GLc c9486GLc = c9490GLg.A01;
                Map<C9486GLc, GKP> map2 = AbstractC9488GLe.A05;
                if (!map2.containsKey(c9486GLc)) {
                    throw AbstractC7611F5y.A0a(c9486GLc, "Unable to serialize variant: ");
                }
                gkpA01 = map2.get(c9486GLc);
                gjm.A05(gkpA01);
                GJL gjl222222222222 = (GJL) gjm.A02();
                return new GKZ(gjl222222222222, AbstractC10509Hny.A01(gjl222222222222.typeUrl_));
            case 10:
                GLV glv = (GLV) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.AesCmacKey");
                GJk gJk = GJk.DEFAULT_INSTANCE;
                Integer num3 = C79.A0P;
                GHW ghwA0A7 = GHS.A0A(gJk, num3);
                GHW ghwA0A8 = GHS.A0A(C9438GJc.DEFAULT_INSTANCE, num3);
                ((C9438GJc) GHW.A00(ghwA0A8)).tagSize_ = glv.A01;
                C9438GJc c9438GJc = (C9438GJc) ghwA0A8.A02();
                GJk gJk2 = (GJk) GHW.A00(ghwA0A7);
                c9438GJc.getClass();
                gJk2.params_ = c9438GJc;
                gJk2.bitField0_ |= 1;
                ((GJk) GHW.A00(ghwA0A7)).keySize_ = glv.A00;
                A03(gjm, ghwA0A7);
                gkpA01 = GLU.A01(glv.A02);
                gjm.A05(gkpA01);
                GJL gjl2222222222222 = (GJL) gjm.A02();
                return new GKZ(gjl2222222222222, AbstractC10509Hny.A01(gjl2222222222222.typeUrl_));
            case 11:
                GLO glo = (GLO) gkq;
                gjm = (GJM) GHS.A09(GJL.DEFAULT_INSTANCE);
                gjm.A07("type.googleapis.com/google.crypto.tink.HmacKey");
                GHW ghwA096 = GHS.A09(GKG.DEFAULT_INSTANCE);
                GKJ gkjA00 = GLN.A00(glo);
                GKG gkg3 = (GKG) GHW.A00(ghwA096);
                gkjA00.getClass();
                gkg3.params_ = gkjA00;
                gkg3.bitField0_ |= 1;
                ((GKG) GHW.A00(ghwA096)).keySize_ = glo.A00;
                A03(gjm, ghwA096);
                GLY<GKP, C9484GLa> gly = GLN.A01;
                C9484GLa c9484GLa = glo.A03;
                Enum r0 = (Enum) gly.A01.get(c9484GLa);
                if (r0 == null) {
                    throw AbstractC7611F5y.A0a(c9484GLa, "Unable to convert object enum: ");
                }
                gkpA01 = (GKP) r0;
                gjm.A05(gkpA01);
                GJL gjl22222222222222 = (GJL) gjm.A02();
                return new GKZ(gjl22222222222222, AbstractC10509Hny.A01(gjl22222222222222.typeUrl_));
            default:
                return null;
        }
    }

    public GL6() {
        HashMap mapA0u = BV4.A0u();
        this.A00 = BV4.A16(new GL5(BV4.A0u(), mapA0u, BV4.A0u(), BV4.A0u()));
    }

    public static C9324GEf A00(GHW ghw) {
        return ghw.A02().A0C();
    }

    public static Hp7 A02(AbstractC9321GEc abstractC9321GEc) {
        return Hp7.A01(abstractC9321GEc.A04());
    }

    public static void A03(GJM gjm, GHW ghw) {
        gjm.A06(ghw.A02().A0C());
    }
}
