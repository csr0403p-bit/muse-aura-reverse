package androidx.datastore.preferences.core;

import X.AbstractC0878AGe;
import X.AbstractC7607F5u;
import X.AbstractC7609F5w;
import X.AbstractC9339GEw;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BV4;
import X.BV6;
import X.C0pA;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C6JZ;
import X.C6O2;
import X.C7384Etj;
import X.C79;
import X.C9364GGa;
import X.GDO;
import X.GGC;
import X.GGG;
import X.GGQ;
import X.GGT;
import X.GGV;
import X.GGY;
import X.GGZ;
import X.HnO;
import X.HyE;
import X.InterfaceC9366GGc;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PreferencesSerializer implements HnO<Preferences> {
    public static final PreferencesSerializer A00 = new PreferencesSerializer();

    @Override // X.HnO
    public final /* bridge */ /* synthetic */ Preferences AEj() {
        return new C6O2(C3cG.A0j(), true);
    }

    @Override // X.HnO
    public final Object AZL(InputStream inputStream) throws Throwable {
        GGT ggc;
        Integer num;
        int iIntValue;
        C6JZ c6jz;
        Object objValueOf;
        try {
            GGZ ggz = GGZ.DEFAULT_INSTANCE;
            if (inputStream == null) {
                ggc = new GGG(GGV.A04);
                try {
                    ggc.A0M(0);
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalArgumentException(e);
                }
            } else {
                ggc = new GGC(inputStream);
            }
            HyE hyEA00 = HyE.A00();
            Integer num2 = C79.A0K;
            AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) ggz.A04(num2);
            try {
                try {
                    InterfaceC9366GGc interfaceC9366GGcA0T = AbstractC7609F5w.A0T(abstractC9339GEw);
                    GGQ ggq = ggc.A01;
                    if (ggq == null) {
                        ggq = new GGQ(ggc);
                    }
                    interfaceC9366GGcA0T.AQc(hyEA00, ggq, abstractC9339GEw);
                    interfaceC9366GGcA0T.AQ3(abstractC9339GEw);
                    byte bByteValue = ((Number) abstractC9339GEw.A04(C79.A00)).byteValue();
                    if (bByteValue != 1) {
                        if (bByteValue != 0) {
                            boolean zAOY = AbstractC7609F5w.A0T(abstractC9339GEw).AOY(abstractC9339GEw);
                            abstractC9339GEw.A04(C79.A01);
                            if (zAOY) {
                            }
                        }
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA0k = AbstractC7607F5u.A0k(new UninitializedMessageException().getMessage());
                        invalidProtocolBufferExceptionA0k.unfinishedMessage = abstractC9339GEw;
                        throw invalidProtocolBufferExceptionA0k;
                    }
                    GGZ ggz2 = (GGZ) abstractC9339GEw;
                    C7384Etj.A0U(ggz2);
                    C6O2 c6o2 = new C6O2(C3cG.A0j(), false);
                    C0pA[] c0pAArr = (C0pA[]) Arrays.copyOf(new C0pA[0], 0);
                    C7384Etj.A0Y(c0pAArr, 0);
                    C6O2.A01(c6o2);
                    if (0 < c0pAArr.length) {
                        throw BV4.A0a("getKey$datastore_preferences_core");
                    }
                    Iterator itA0n = AnonymousClass002.A0n(Collections.unmodifiableMap(ggz2.preferences_));
                    while (itA0n.hasNext()) {
                        Map.Entry entryA0l = C3cH.A0l(itA0n);
                        String strA0t = C60O.A0t(entryA0l);
                        GGY ggy = (GGY) entryA0l.getValue();
                        C7384Etj.A0S(strA0t);
                        C7384Etj.A0S(ggy);
                        switch (ggy.valueCase_) {
                            case 0:
                                num = C79.A0Y;
                                iIntValue = num.intValue();
                                break;
                            case 1:
                                num = C79.A00;
                                iIntValue = num.intValue();
                                break;
                            case 2:
                                num = C79.A01;
                                iIntValue = num.intValue();
                                break;
                            case 3:
                                num = C79.A0C;
                                iIntValue = num.intValue();
                                break;
                            case 4:
                                num = num2;
                                iIntValue = num.intValue();
                                break;
                            case 5:
                                num = C79.A0P;
                                iIntValue = num.intValue();
                                break;
                            case 6:
                                num = C79.A0T;
                                iIntValue = num.intValue();
                                break;
                            case 7:
                                num = C79.A0W;
                                iIntValue = num.intValue();
                                break;
                            default:
                                iIntValue = -1;
                                break;
                        }
                        switch (iIntValue) {
                            case -1:
                                throw new CorruptionException("Value case is null.", null);
                            case 0:
                                c6jz = new C6JZ(strA0t);
                                objValueOf = Boolean.valueOf(ggy.valueCase_ == 1 ? AnonymousClass001.A1X(ggy.value_) : false);
                                break;
                            case 1:
                                c6jz = new C6JZ(strA0t);
                                objValueOf = Float.valueOf(ggy.valueCase_ == 2 ? AnonymousClass001.A02(ggy.value_) : 0.0f);
                                break;
                            case 2:
                                c6jz = new C6JZ(strA0t);
                                objValueOf = Integer.valueOf(ggy.valueCase_ == 3 ? AnonymousClass001.A0F(ggy.value_) : 0);
                                break;
                            case 3:
                                c6jz = new C6JZ(strA0t);
                                objValueOf = Long.valueOf(ggy.valueCase_ == 4 ? C3cG.A05(ggy.value_) : 0L);
                                break;
                            case 4:
                                C6JZ c6jz2 = new C6JZ(strA0t);
                                String str = ggy.valueCase_ == 5 ? ggy.value_ : "";
                                C7384Etj.A0U(str);
                                c6o2.A08(c6jz2, str);
                                continue;
                            case 5:
                                c6jz = new C6JZ(strA0t);
                                GDO<String> gdo = (ggy.valueCase_ == 6 ? (C9364GGa) ggy.value_ : C9364GGa.DEFAULT_INSTANCE).strings_;
                                C7384Etj.A0U(gdo);
                                objValueOf = AbstractC0878AGe.A0g(gdo);
                                break;
                            case 6:
                                c6jz = new C6JZ(strA0t);
                                objValueOf = Double.valueOf(ggy.valueCase_ == 7 ? BV6.A00(ggy.value_) : 0.0d);
                                break;
                            default:
                                throw new CorruptionException("Value not set.", null);
                        }
                        c6o2.A08(c6jz, objValueOf);
                    }
                    return c6o2.A05();
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof InvalidProtocolBufferException) {
                        throw e2.getCause();
                    }
                    throw e2;
                }
            } catch (IOException e3) {
                if (e3.getCause() instanceof InvalidProtocolBufferException) {
                    throw e3.getCause();
                }
                InvalidProtocolBufferException invalidProtocolBufferExceptionA0k2 = AbstractC7607F5u.A0k(e3.getMessage());
                invalidProtocolBufferExceptionA0k2.unfinishedMessage = abstractC9339GEw;
                throw invalidProtocolBufferExceptionA0k2;
            }
        } catch (InvalidProtocolBufferException e4) {
            throw new CorruptionException("Unable to parse preferences proto.", e4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x005c A[SYNTHETIC] */
    @Override // X.HnO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ kotlin.Unit Aj2(java.io.OutputStream r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.PreferencesSerializer.Aj2(java.io.OutputStream, java.lang.Object):kotlin.Unit");
    }
}
