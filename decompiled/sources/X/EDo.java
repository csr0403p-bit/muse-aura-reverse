package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.secure.attestation.keystore.KeystoreOperationException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EDo extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EDo(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(0);
        this.$t = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A00 = obj4;
        this.A02 = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() throws Throwable {
        C6561EEz c6561EEz;
        boolean z;
        EF2 ef2;
        AbstractCollection singletonImmutableSet;
        DAG dagA00;
        String string;
        StringBuilder sbA0w;
        Integer num;
        Integer num2;
        int i;
        switch (this.$t) {
            case 0:
                C3432CNc c3432CNc = (C3432CNc) this.A03;
                byte[] bArr = (byte[]) this.A00;
                EFP efp = (EFP) this.A02;
                EF5 ef5 = c3432CNc.A00;
                int length = bArr.length;
                if (length <= 0 || length > 128) {
                    Integer num3 = C79.A00;
                    c6561EEz = new C6561EEz(null, C79.A01, null, ImmutableList.of(new EEy(num3, num3)), RegularImmutableSet.A05);
                } else {
                    byte[] bArrCopyOf = Arrays.copyOf(bArr, length);
                    RegularImmutableSet<Object> regularImmutableSet = RegularImmutableSet.A05;
                    C6560EEx c6560EEx = new C6560EEx(regularImmutableSet, C3cG.A0h());
                    try {
                        EF1 ef1 = ef5.A01;
                        int i2 = ef1.A00;
                        DOG dog = new DOG();
                        ImmutableSet<EF2> immutableSet = efp.A00;
                        AbstractC7489Ext<EF2> it = immutableSet.iterator();
                        while (it.hasNext()) {
                            EF2 next = it.next();
                            int iOrdinal = next.ordinal();
                            if (iOrdinal == 0) {
                                i = 28;
                            } else {
                                if (iOrdinal != 1) {
                                    throw BV4.A0N(AnonymousClass007.A0a("Unknown capability: ", next));
                                }
                                i = 31;
                            }
                            if (i2 >= i) {
                                dog.A02(next);
                            }
                        }
                        ImmutableSet immutableSetBuild = dog.build();
                        for (EF2 ef22 : EF2.values()) {
                            if (immutableSet.contains(ef22) && !immutableSetBuild.contains(ef22)) {
                                C6560EEx c6560EEx2 = new C6560EEx(ImmutableSet.A01(new SingletonImmutableSet(ef22)), c6560EEx.A01);
                                c6560EEx2.A01.add(C6560EEx.A00(new EFC(EFB.A02, C79.A0C), c6560EEx2, null, C79.A0Z));
                            }
                        }
                        EnumSet enumSetNoneOf = EnumSet.noneOf(EF2.class);
                        AbstractC7489Ext<EF9> it2 = EF1.A03.iterator();
                        KeystoreOperationException e = null;
                        while (it2.hasNext()) {
                            EF9 next2 = it2.next();
                            ImmutableSet<EF2> immutableSet2 = next2.A00;
                            if (immutableSetBuild.containsAll(immutableSet2) && (!(z = next2.A01) || Collections.disjoint(immutableSet2, enumSetNoneOf))) {
                                if (e != null) {
                                    c6560EEx.A01.add(e.mError);
                                }
                                ImmutableSet immutableSetA01 = ImmutableSet.A01(immutableSet2);
                                List<EEy> list = c6560EEx.A01;
                                C6560EEx c6560EEx3 = new C6560EEx(immutableSetA01, list);
                                try {
                                    EEw eEw = ef1.A01;
                                    if (z) {
                                        eEw.A03(c6560EEx3, bArrCopyOf);
                                    } else {
                                        ImmutableSet<EF2> immutableSet3 = c6560EEx3.A00;
                                        Integer num4 = C79.A0P;
                                        Integer num5 = C79.A0Z;
                                        Class[] clsArr = {IllegalArgumentException.class, IllegalStateException.class};
                                        try {
                                            KeyGenParameterSpec.Builder builderA00 = EEw.A00();
                                            if (immutableSet3.contains(EF2.STRONGBOX)) {
                                                builderA00.setIsStrongBoxBacked(true);
                                            }
                                            EEw.A02(builderA00.build(), eEw, c6560EEx3);
                                            c6560EEx3.A01.add(C6560EEx.A00(new EFC(EFB.A02, C79.A0c), c6560EEx3, null, C79.A0T));
                                        } catch (IOException | GeneralSecurityException e2) {
                                            throw C6560EEx.A01(c6560EEx3, e2, num4, num5);
                                        } catch (RuntimeException e3) {
                                            if (C6560EEx.A02(e3, clsArr)) {
                                                throw C6560EEx.A01(c6560EEx3, e3, num4, num5);
                                            }
                                            throw e3;
                                        }
                                    }
                                    KeyStore.PrivateKeyEntry privateKeyEntryA01 = ef1.A02.A01(c6560EEx);
                                    if (privateKeyEntryA01 == null) {
                                        throw c6560EEx.A03(C79.A0C, C79.A0T);
                                    }
                                    try {
                                        dagA00 = DAF.A00(c6560EEx, privateKeyEntryA01);
                                    } catch (KeystoreOperationException e4) {
                                        list.add(e4.mError);
                                        dagA00 = null;
                                    }
                                    try {
                                        Certificate[] certificateChain = privateKeyEntryA01.getCertificateChain();
                                        sbA0w = C60O.A0w();
                                        for (int i3 = 0; i3 < certificateChain.length; i3++) {
                                            Certificate certificate = certificateChain[i3];
                                            try {
                                                num = C79.A0Y;
                                                num2 = C79.A05;
                                            } catch (KeystoreOperationException e5) {
                                                EEy eEy = e5.mError;
                                                String string2 = Integer.toString(i3);
                                                HashMap mapA0w = BV4.A0w(eEy.A01);
                                                mapA0w.put("certificate_chain_index", string2);
                                                list.add(new EEy(eEy.A00, ImmutableMap.copyOf((Map) mapA0w), eEy.A03, eEy.A04, eEy.A05, eEy.A02));
                                            }
                                            try {
                                                String strTrim = FGI.A0U("-----BEGIN CERTIFICATE-----\n", Base64.encodeToString(certificate.getEncoded(), 0), "-----END CERTIFICATE-----\n").trim();
                                                if (sbA0w.length() > 0) {
                                                    sbA0w.append('\n');
                                                }
                                                sbA0w.append(strTrim);
                                            } catch (IOException | GeneralSecurityException e6) {
                                                e = C6560EEx.A01(c6560EEx, e6, num, num2);
                                                throw e;
                                                break;
                                            } catch (RuntimeException e7) {
                                                e = e7;
                                                throw e;
                                            }
                                        }
                                    } catch (KeystoreOperationException e8) {
                                        list.add(e8.mError);
                                        string = null;
                                    }
                                    if (sbA0w.length() == 0) {
                                        throw c6560EEx.A03(C79.A0Y, C79.A04);
                                    }
                                    string = sbA0w.toString();
                                    ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) list);
                                    c6561EEz = string == null ? new C6561EEz(dagA00, C79.A01, null, immutableListCopyOf, immutableSet2) : new C6561EEz(dagA00, C79.A00, string, immutableListCopyOf, immutableSet2);
                                } catch (KeystoreOperationException e9) {
                                    e = e9;
                                    int iIntValue = e.mError.A04.intValue();
                                    if (iIntValue == 10) {
                                        ef2 = EF2.STRONGBOX;
                                    } else if (iIntValue != 11) {
                                        singletonImmutableSet = regularImmutableSet;
                                        enumSetNoneOf.addAll(singletonImmutableSet);
                                    } else {
                                        ef2 = EF2.DEVICE_INFORMATION;
                                    }
                                    singletonImmutableSet = new SingletonImmutableSet(ef2);
                                    enumSetNoneOf.addAll(singletonImmutableSet);
                                }
                            }
                        }
                        if (e == null) {
                            throw BV4.A0N("No rung ran, yet the last one requests nothing and never prunes");
                        }
                        throw e;
                    } catch (KeystoreOperationException e10) {
                        EEy eEy2 = e10.mError;
                        List<EEy> list2 = c6560EEx.A01;
                        list2.add(eEy2);
                        c6561EEz = new C6561EEz(null, C79.A01, null, ImmutableList.copyOf((Collection) list2), regularImmutableSet);
                    }
                }
                DAG dag = c6561EEz.A00;
                String str = dag != null ? dag.A00 : null;
                String str2 = c6561EEz.A04;
                ImmutableSet<EF2> immutableSet4 = c6561EEz.A03.intValue() == 0 ? c6561EEz.A02 : null;
                ImmutableList<EEy> immutableList = c6561EEz.A01;
                C7384Etj.A0U(immutableList);
                return new EF7(str, str2, immutableList, immutableSet4);
            case 1:
                return ((PandoGraphQLConsistencyJNI) this.A03).subscribeToModel((InterfaceC2619Bfl) this.A02, (CPW) this.A01, (Executor) this.A00);
            default:
                EXP.A03((EXZ) this.A00, (EXP) this.A03, (C6729EXn) this.A01, (C6718EXb) this.A02, "IAC: sandbox session creation timed out");
                return Unit.INSTANCE;
        }
    }
}
