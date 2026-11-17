package X;

import com.google.crypto.tink.BinaryKeysetReader;
import com.google.crypto.tink.internal.TinkBugException;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GKR implements GMS {
    public final GKR A00;
    public final C10458Hjg A01;
    public final List<GKW> A02;

    @Deprecated
    public static final GKR A00(EX9 reader, BinaryKeysetReader masterKey, byte[] associatedData) throws GeneralSecurityException, IOException {
        try {
            InputStream inputStream = masterKey.A00;
            GHM ghmA02 = GHM.A02(new GGB(inputStream), HzL.A00(), GJ1.DEFAULT_INSTANCE);
            GHM.A06(ghmA02);
            GJ1 gj1 = (GJ1) ghmA02;
            inputStream.close();
            if (gj1 != null) {
                AbstractC9321GEc abstractC9321GEc = gj1.encryptedKeyset_;
                if (abstractC9321GEc.A02() != 0) {
                    try {
                        GJ4 gj4 = (GJ4) GHM.A03(HzL.A00(), GJ4.DEFAULT_INSTANCE, reader.A8i(abstractC9321GEc.A04(), associatedData));
                        if (gj4 == null || gj4.key_.size() <= 0) {
                            throw BV6.A0u("empty keyset");
                        }
                        return A02(gj4);
                    } catch (InvalidProtocolBufferException unused) {
                        throw BV6.A0u("invalid keyset, corrupted key material");
                    }
                }
            }
            throw BV6.A0u("empty keyset");
        } catch (Throwable th) {
            masterKey.A00.close();
            throw th;
        }
    }

    public static final GKR A01(Ht8 keyTemplate) throws GeneralSecurityException {
        int iA0C;
        GJC gjc;
        GKQ gkq = keyTemplate.A00;
        if (gkq == null) {
            try {
                GL6.A01.A07(gkq);
                throw F60.createAndThrow();
            } catch (GeneralSecurityException e) {
                throw new TinkBugException(AnonymousClass007.A0a("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ", gkq), e);
            }
        }
        C9460GKc c9460GKc = new C9460GKc();
        C9458GKa c9458GKa = new C9458GKa(gkq);
        C9468GKk c9468GKk = C9468GKk.A00;
        c9458GKa.A01 = c9468GKk;
        C9460GKc c9460GKc2 = c9458GKa.A02;
        if (c9460GKc2 != null) {
            Iterator<C9458GKa> it = c9460GKc2.A02.iterator();
            while (it.hasNext()) {
                it.next().A03 = false;
            }
        }
        c9458GKa.A03 = true;
        if (c9458GKa.A02 != null) {
            throw C3cG.A0Q("Entry has already been added to a KeysetHandle.Builder");
        }
        List<C9458GKa> list = c9460GKc.A02;
        Iterator<C9458GKa> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().A03 = false;
        }
        c9458GKa.A02 = c9460GKc;
        list.add(c9458GKa);
        if (c9460GKc.A01) {
            throw BV6.A0u("KeysetHandle.Builder#build must only be called once");
        }
        c9460GKc.A01 = true;
        ArrayList arrayListA0t = C60Q.A0t(list);
        for (int i = 0; i < C60O.A00(list); i++) {
            if (list.get(i).A01 == c9468GKk && list.get(i + 1).A01 != c9468GKk) {
                throw BV6.A0u("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSetA13 = C60O.A13();
        Integer num = null;
        for (C9458GKa c9458GKa2 : list) {
            C9461GKd c9461GKd = c9458GKa2.A00;
            C9468GKk c9468GKk2 = c9458GKa2.A01;
            if (c9468GKk2 == null) {
                throw BV6.A0u("No ID was set (with withFixedId or withRandomId)");
            }
            if (c9468GKk2 != c9468GKk) {
                iA0C = 0;
            } else {
                do {
                    do {
                        byte[] bArrA00 = EXH.A00(4);
                        iA0C = (bArrA00[3] & 255) | AbstractC7608F5v.A0C(bArrA00, 2, ((bArrA00[0] & 255) << 24) | ((bArrA00[1] & 255) << 16));
                    } while (iA0C == 0);
                } while (AbstractC7608F5v.A1Y(hashSetA13, iA0C));
            }
            Integer numValueOf = Integer.valueOf(iA0C);
            if (hashSetA13.contains(numValueOf)) {
                throw BV6.A0u(FGI.A0I("Id ", iA0C, " is used twice in the keyset"));
            }
            hashSetA13.add(numValueOf);
            GKQ gkq2 = c9458GKa2.A04;
            AbstractC9465GKh abstractC9465GKhA00 = C9471GKn.A00(gkq2, C9471GKn.A02, gkq2.A01() ? numValueOf : null);
            C9461GKd c9461GKd2 = C9461GKd.A03;
            if (c9461GKd2.equals(c9461GKd)) {
                gjc = GJC.ENABLED;
            } else if (C9461GKd.A02.equals(c9461GKd)) {
                gjc = GJC.DISABLED;
            } else {
                if (!C9461GKd.A01.equals(c9461GKd)) {
                    throw C3cG.A0Q("Unknown key status");
                }
                gjc = GJC.DESTROYED;
            }
            boolean z = c9458GKa2.A03;
            GKW gkw = new GKW(abstractC9465GKhA00, GKW.A07, gjc, iA0C, z, false);
            if (z) {
                if (num != null) {
                    throw BV6.A0u("Two primaries were set");
                }
                num = numValueOf;
                if (c9461GKd != c9461GKd2) {
                    throw BV6.A0u("Primary key is not enabled");
                }
            }
            arrayListA0t.add(gkw);
        }
        if (num == null) {
            throw BV6.A0u("No primary was set");
        }
        final GKR gkr = new GKR(c9460GKc.A00, arrayListA0t);
        final C10458Hjg c10458Hjg = gkr.A01;
        if (c10458Hjg.A00.isEmpty()) {
            return gkr;
        }
        InterfaceC9469GKl interfaceC9469GKl = new InterfaceC9469GKl() { // from class: X.GKg
        };
        List<GKW> list2 = gkr.A02;
        ArrayList arrayListA0t2 = C60Q.A0t(list2);
        for (GKW gkw2 : list2) {
            arrayListA0t2.add(new GKW(gkw2.A01, interfaceC9469GKl, gkw2.A03, gkw2.A00, gkw2.A04, gkw2.A05));
        }
        return new GKR(gkr, c10458Hjg, arrayListA0t2);
    }

    public static final GKR A02(GJ4 keyset) throws GeneralSecurityException {
        AbstractC9465GKh c9475GKr;
        boolean z;
        int iOrdinal;
        if (keyset == null || keyset.key_.size() <= 0) {
            throw BV6.A0u("empty keyset");
        }
        ArrayList arrayListA0t = C60Q.A0t(keyset.key_);
        for (GJA gja : keyset.key_) {
            int i = gja.keyId_;
            try {
                GKV gkvA03 = A03(gja);
                GL6 gl6 = GL6.A01;
                c9475GKr = !gl6.A00.get().A00.containsKey(new Hqs(gkvA03.A03, gkvA03.getClass())) ? new C9475GKr(gkvA03) : gl6.A04(gkvA03);
                z = false;
            } catch (GeneralSecurityException e) {
                if (AbstractC9466GKi.A00.A00.get()) {
                    throw e;
                }
                c9475GKr = new C9475GKr(A03(gja));
                z = true;
            }
            if (AbstractC9466GKi.A00.A00.get() && (iOrdinal = gja.A0F().ordinal()) != 1 && iOrdinal != 3 && iOrdinal != 2) {
                throw BV6.A0u("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayListA0t.add(new GKW(c9475GKr, GKW.A07, gja.A0F(), i, AnonymousClass002.A1Q(i, keyset.primaryKeyId_), z));
        }
        return new GKR(C10458Hjg.A01, Collections.unmodifiableList(arrayListA0t));
    }

    public static GKV A03(GJA protoKey) {
        int i = protoKey.keyId_;
        GKP gkpA00 = GKP.A00(protoKey.outputPrefixType_);
        if (gkpA00 == null) {
            gkpA00 = GKP.UNRECOGNIZED;
        }
        Integer numValueOf = gkpA00 == GKP.RAW ? null : Integer.valueOf(i);
        GJN gjn = protoKey.keyData_;
        GJN gjn2 = gjn;
        if (gjn == null) {
            gjn = GJN.DEFAULT_INSTANCE;
        }
        String str = gjn.typeUrl_;
        GJN gjn3 = gjn2;
        if (gjn2 == null) {
            gjn3 = GJN.DEFAULT_INSTANCE;
        }
        AbstractC9321GEc abstractC9321GEc = gjn3.value_;
        if (gjn2 == null) {
            gjn2 = GJN.DEFAULT_INSTANCE;
        }
        return GKV.A00(gjn2.A0F(), gkpA00, abstractC9321GEc, numValueOf, str);
    }

    public final GJ4 A04() throws GeneralSecurityException {
        try {
            GJ4 gj4 = GJ4.DEFAULT_INSTANCE;
            Integer num = C79.A0P;
            GHW ghwA0A = GHS.A0A(gj4, num);
            for (GKW gkw : this.A02) {
                AbstractC9465GKh abstractC9465GKh = gkw.A01;
                GJC gjc = gkw.A03;
                int i = gkw.A00;
                GKV gkv = (GKV) GL6.A01.A06(abstractC9465GKh);
                Integer num2 = abstractC9465GKh instanceof Ho4 ? ((Ho4) abstractC9465GKh).A03 : abstractC9465GKh instanceof Htd ? ((Htd) abstractC9465GKh).A03 : abstractC9465GKh instanceof C9475GKr ? ((C9475GKr) abstractC9465GKh).A00.A04 : abstractC9465GKh instanceof C9492GLi ? ((C9492GLi) abstractC9465GKh).A03 : abstractC9465GKh instanceof GM0 ? ((GM0) abstractC9465GKh).A03 : abstractC9465GKh instanceof C9507GLy ? ((C9507GLy) abstractC9465GKh).A03 : abstractC9465GKh instanceof GM2 ? ((GM2) abstractC9465GKh).A02 : abstractC9465GKh instanceof GM1 ? ((GM1) abstractC9465GKh).A02 : abstractC9465GKh instanceof C9508GLz ? ((C9508GLz) abstractC9465GKh).A03 : abstractC9465GKh instanceof HjH ? ((HjH) abstractC9465GKh).A03 : abstractC9465GKh instanceof GMI ? ((GMI) abstractC9465GKh).A03 : abstractC9465GKh instanceof Hnc ? ((Hnc) abstractC9465GKh).A03 : ((C10536Hqh) abstractC9465GKh).A04;
                if (num2 != null && num2.intValue() != i) {
                    throw BV6.A0u("Wrong ID set for key with ID requirement");
                }
                GHW ghwA0A2 = GHS.A0A(GJA.DEFAULT_INSTANCE, num);
                GHW ghwA0A3 = GHS.A0A(GJN.DEFAULT_INSTANCE, num);
                String str = gkv.A05;
                GJN gjn = (GJN) GHW.A00(ghwA0A3);
                str.getClass();
                gjn.typeUrl_ = str;
                AbstractC9321GEc abstractC9321GEc = gkv.A02;
                GJN gjn2 = (GJN) GHW.A00(ghwA0A3);
                abstractC9321GEc.getClass();
                gjn2.value_ = abstractC9321GEc;
                GJO gjo = gkv.A00;
                GJN gjn3 = (GJN) GHW.A00(ghwA0A3);
                if (gjo == GJO.UNRECOGNIZED) {
                    throw C60O.A0i("Can't get the number of an unknown enum value.");
                }
                gjn3.keyMaterialType_ = gjo.value;
                GJA gja = (GJA) GHW.A00(ghwA0A2);
                GJN gjn4 = (GJN) ghwA0A3.A02();
                gjn4.getClass();
                gja.keyData_ = gjn4;
                gja.bitField0_ |= 1;
                GJA gja2 = (GJA) GHW.A00(ghwA0A2);
                if (gjc == GJC.UNRECOGNIZED) {
                    throw C60O.A0i("Can't get the number of an unknown enum value.");
                }
                gja2.status_ = gjc.value;
                ((GJA) GHW.A00(ghwA0A2)).keyId_ = i;
                ((GJA) GHW.A00(ghwA0A2)).outputPrefixType_ = gkv.A01.A01();
                GHM ghmA02 = ghwA0A2.A02();
                GJ4 gj42 = (GJ4) GHW.A00(ghwA0A);
                GDP<GJA> gdp = gj42.key_;
                boolean z = ((GDF) gdp).A00;
                List list = gdp;
                if (!z) {
                    GDP<GJA> gdpAR1 = gdp.AR1(gdp.size() * 2);
                    gj42.key_ = gdpAR1;
                    list = gdpAR1;
                }
                list.add(ghmA02);
                if (gkw.A04) {
                    ((GJ4) GHW.A00(ghwA0A)).primaryKeyId_ = i;
                }
            }
            return (GJ4) ghwA0A.A02();
        } catch (GeneralSecurityException e) {
            throw new TinkBugException(e);
        }
    }

    @Deprecated
    public final <P> P A05(Class<P> cls) throws GeneralSecurityException {
        int iOrdinal;
        GKR gkr = this.A00;
        if (gkr == null) {
            gkr = this;
        }
        GJ4 gj4A04 = gkr.A04();
        int i = gj4A04.primaryKeyId_;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (GJA gja : gj4A04.key_) {
            GJC gjcA0F = gja.A0F();
            if (gjcA0F == GJC.ENABLED) {
                if ((gja.bitField0_ & 1) == 0) {
                    throw AbstractC7609F5w.A0v("key %d has no key data", BV5.A1Y(gja.keyId_));
                }
                GKP gkpA00 = GKP.A00(gja.outputPrefixType_);
                if (gkpA00 == null) {
                    gkpA00 = GKP.UNRECOGNIZED;
                }
                if (gkpA00 == GKP.UNKNOWN_PREFIX) {
                    throw AbstractC7609F5w.A0v("key %d has unknown prefix", BV5.A1Y(gja.keyId_));
                }
                if (gjcA0F == GJC.UNKNOWN_STATUS) {
                    throw AbstractC7609F5w.A0v("key %d has unknown status", BV5.A1Y(gja.keyId_));
                }
                if (gja.keyId_ == i) {
                    if (z) {
                        throw BV6.A0u("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                GJN gjn = gja.keyData_;
                if (gjn == null) {
                    gjn = GJN.DEFAULT_INSTANCE;
                }
                if (gjn.A0F() != GJO.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw BV6.A0u("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw BV6.A0u("keyset doesn't contain a valid primary key");
        }
        int i3 = 0;
        while (true) {
            List<GKW> list = this.A02;
            if (i3 >= list.size()) {
                C10458Hjg c10458Hjg = this.A01;
                final GL8 gl8 = GL9.A01.A00.get();
                Map<Class<?>, GKY<?, ?>> map = gl8.A01;
                if (!map.containsKey(cls)) {
                    throw AbstractC7611F5y.A0a(cls, "No wrapper found for ");
                }
                final GKY<?, ?> gky = map.get(cls);
                return (P) gky.AiZ(gkr, c10458Hjg, new InterfaceC9462GKe() { // from class: X.GKb
                    @Override // X.InterfaceC9462GKe
                    public final Object A7W(GKW gkw) {
                        return gl8.A00(gkw.A01, gky.AGX());
                    }
                });
            }
            if (list.get(i3).A05 || !((iOrdinal = list.get(i3).A03.ordinal()) == 1 || iOrdinal == 3 || iOrdinal == 2)) {
                break;
            }
            i3++;
        }
        GJN gjn2 = gj4A04.key_.get(i3).keyData_;
        if (gjn2 == null) {
            gjn2 = GJN.DEFAULT_INSTANCE;
        }
        throw BV6.A0u(FGI.A09(i3, "Key parsing of key with index ", " and type_url ", gjn2.typeUrl_, " failed, unable to get primitive"));
    }

    @Override // X.GMS
    public final /* bridge */ /* synthetic */ GKW ACV(int i) {
        if (i >= 0) {
            List<GKW> list = this.A02;
            if (i < list.size()) {
                GKW gkw = list.get(i);
                int iOrdinal = gkw.A03.ordinal();
                boolean z = true;
                if (iOrdinal != 1 && iOrdinal != 3 && iOrdinal != 2) {
                    z = false;
                }
                if (!z) {
                    throw FGI.A04("Keyset-Entry at position ", " has wrong status", i);
                }
                if (gkw.A05) {
                    throw FGI.A04("Keyset-Entry at position ", " didn't parse correctly", i);
                }
                return list.get(i);
            }
        }
        throw C8j3.A0y(BV3.A00(35), " for keyset of size ", i, this.A02.size());
    }

    @Override // X.GMS
    public final /* bridge */ /* synthetic */ GKW AJ5() {
        for (GKW gkw : this.A02) {
            if (gkw != null && gkw.A04) {
                if (gkw.A02 == C9461GKd.A03) {
                    return gkw;
                }
                throw C3cG.A0Q("Keyset has primary which isn't enabled");
            }
        }
        throw C3cG.A0Q("Keyset has no valid primary");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/GKW;>;LX/Hjg;)V */
    public GKR(C10458Hjg entries, List annotations) throws GeneralSecurityException {
        this.A02 = annotations;
        this.A01 = entries;
        if (AbstractC9466GKi.A00.A00.get()) {
            HashSet hashSetA13 = C60O.A13();
            Iterator it = annotations.iterator();
            boolean z = false;
            while (it.hasNext()) {
                GKW gkw = (GKW) it.next();
                int i = gkw.A00;
                Integer numValueOf = Integer.valueOf(i);
                if (hashSetA13.contains(numValueOf)) {
                    throw BV6.A0u(FGI.A0I("KeyID ", i, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSetA13.add(numValueOf);
                if (gkw.A04) {
                    z = true;
                }
            }
            if (!z) {
                throw BV6.A0u("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.A00 = null;
    }

    public final String toString() {
        return GJ9.A00(A04()).toString();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/GKW;>;LX/Hjg;LX/GKR;)V */
    public GKR(GKR entries, C10458Hjg annotations, List unmonitoredHandle) {
        this.A02 = unmonitoredHandle;
        this.A01 = annotations;
        this.A00 = entries;
    }
}
