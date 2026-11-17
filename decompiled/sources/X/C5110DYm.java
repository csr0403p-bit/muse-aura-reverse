package X;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.facebook.secure.attestation.keystore.KeystoreOperationException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableSet;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableEntryException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DYm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5110DYm extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5110DYm(Object obj, Object obj2, Object obj3, String str, int i) {
        super(0);
        this.$t = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A00 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.DAG, byte[], java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() throws NoSuchAlgorithmException, SignatureException, KeystoreOperationException, InvalidKeyException, KeyStoreException, UnrecoverableEntryException {
        ?? r4;
        EF8 ef8;
        String str;
        EF4 ef4;
        EFC efc;
        EFC efc2;
        HxE hxEA0r;
        List listA0P;
        byte[] bArr;
        if (this.$t != 0) {
            ((G0U) (((C9WD) this.A02).A04 ? this.A01 : this.A00)).invoke(this.A03);
            return Unit.INSTANCE;
        }
        C3432CNc c3432CNc = (C3432CNc) this.A02;
        String str2 = this.A03;
        byte[] bArr2 = (byte[]) this.A00;
        EF5 ef5 = c3432CNc.A00;
        RegularImmutableSet<Object> regularImmutableSet = RegularImmutableSet.A05;
        C6560EEx c6560EEx = new C6560EEx(regularImmutableSet, C3cG.A0h());
        try {
            KeyStore.PrivateKeyEntry privateKeyEntryA01 = ef5.A00.A01(c6560EEx);
            if (privateKeyEntryA01 == null) {
                r4 = 0;
                ef8 = new EF8(null, null, C79.A01);
            } else {
                r4 = 0;
                ef8 = new EF8(null, DAF.A00(c6560EEx, privateKeyEntryA01), C79.A00);
            }
        } catch (KeystoreOperationException e) {
            EEy eEy = e.mError;
            List<EEy> list = c6560EEx.A01;
            list.add(eEy);
            r4 = 0;
            ef8 = new EF8((EEy) AbstractC7398Eub.A00(ImmutableList.copyOf((Collection) list)), null, C79.A0C);
        }
        DAG dag = ef8.A01;
        if (dag == null || (str = dag.A00) == null) {
            int iIntValue = ef8.A02.intValue();
            return new EF6(r4, r4, iIntValue != 0 ? iIntValue != 1 ? AbstractC0885AGm.A0z(ef8.A00) : Collections.singletonList(new EEy(C79.A0B, C3432CNc.A02)) : C0881AGi.A00);
        }
        if (str2 == null || str.equals(str2)) {
            int length = bArr2.length;
            if (length > 65536) {
                ef4 = new EF4(r4, C79.A0C, ImmutableList.of(new EEy(C79.A01, C79.A00)), r4);
            } else {
                byte[] bArrCopyOf = Arrays.copyOf(bArr2, length);
                C6560EEx c6560EEx2 = new C6560EEx(regularImmutableSet, C3cG.A0h());
                try {
                    KeyStore.PrivateKeyEntry privateKeyEntryA012 = ef5.A02.A01.A01(c6560EEx2);
                    if (privateKeyEntryA012 == null) {
                        ef4 = new EF4(r4, C79.A01, ImmutableList.of(), r4);
                    } else {
                        DAG dagA00 = DAF.A00(c6560EEx2, privateKeyEntryA012);
                        Integer num = C79.A0c;
                        Integer num2 = C79.A06;
                        Class[] clsArr = {ProviderException.class};
                        try {
                            Signature signature = Signature.getInstance("SHA256withECDSA");
                            Integer num3 = C79.A02;
                            Integer num4 = C79.A08;
                            Class[] clsArr2 = {ProviderException.class};
                            try {
                                try {
                                    signature.initSign(privateKeyEntryA012.getPrivateKey());
                                    Integer num5 = C79.A03;
                                    Integer num6 = C79.A09;
                                    Class[] clsArr3 = {ProviderException.class};
                                    try {
                                        try {
                                            signature.update(bArrCopyOf);
                                            byte[] bArrSign = signature.sign();
                                            ef4 = new EF4(dagA00, C79.A00, ImmutableList.of(), Arrays.copyOf(bArrSign, bArrSign.length));
                                        } catch (RuntimeException e2) {
                                            if (C6560EEx.A02(e2, clsArr3)) {
                                                throw C6560EEx.A01(c6560EEx2, e2, num5, num6);
                                            }
                                            throw e2;
                                        }
                                    } catch (IOException | GeneralSecurityException e3) {
                                        throw C6560EEx.A01(c6560EEx2, e3, num5, num6);
                                    }
                                } catch (RuntimeException e4) {
                                    if (!C6560EEx.A02(e4, clsArr2)) {
                                        throw e4;
                                    }
                                    if (e4 instanceof KeyPermanentlyInvalidatedException) {
                                        efc2 = new EFC(EFB.A02, C79.A07);
                                    } else {
                                        if (e4 instanceof ProviderException) {
                                            num4 = C79.A0A;
                                        }
                                        efc2 = new EFC(EFB.A02, num4);
                                    }
                                    Exception exc = efc2.A00.A00;
                                    if (exc == null) {
                                        exc = e4;
                                    }
                                    throw new KeystoreOperationException(C6560EEx.A00(efc2, c6560EEx2, exc, num3));
                                }
                            } catch (IOException | GeneralSecurityException e5) {
                                if (e5 instanceof KeyPermanentlyInvalidatedException) {
                                    efc = new EFC(EFB.A02, C79.A07);
                                } else {
                                    if (e5 instanceof ProviderException) {
                                        num4 = C79.A0A;
                                    }
                                    efc = new EFC(EFB.A02, num4);
                                }
                                Exception exc2 = efc.A00.A00;
                                if (exc2 == null) {
                                    exc2 = e5;
                                }
                                throw new KeystoreOperationException(C6560EEx.A00(efc, c6560EEx2, exc2, num3));
                            }
                        } catch (IOException | GeneralSecurityException e6) {
                            throw C6560EEx.A01(c6560EEx2, e6, num, num2);
                        } catch (RuntimeException e7) {
                            if (C6560EEx.A02(e7, clsArr)) {
                                throw C6560EEx.A01(c6560EEx2, e7, num, num2);
                            }
                            throw e7;
                        }
                    }
                } catch (KeystoreOperationException e8) {
                    EEy eEy2 = e8.mError;
                    List<EEy> list2 = c6560EEx2.A01;
                    list2.add(eEy2);
                    ef4 = new EF4(r4, C79.A0C, ImmutableList.copyOf((Collection) list2), r4);
                }
            }
            DAG dag2 = ef4.A00;
            String str3 = dag2 != null ? dag2.A00 : r4;
            int iIntValue2 = ef4.A02.intValue();
            if (iIntValue2 != 0) {
                hxEA0r = iIntValue2 != 1 ? new HxE(r4, r4) : C3cG.A0r(r4, new EEy(C79.A0D, C3432CNc.A02));
            } else if (str.equals(str3)) {
                byte[] bArr3 = ef4.A03;
                hxEA0r = C3cG.A0r(bArr3 == null ? null : Arrays.copyOf(bArr3, bArr3.length), r4);
            } else {
                hxEA0r = C3cG.A0r(r4, new EEy(C79.A0E, C3432CNc.A02));
            }
            byte[] bArr4 = (byte[]) hxEA0r.first;
            Object obj = hxEA0r.second;
            if (str3 != null) {
                str = str3;
            }
            ImmutableList<EEy> immutableList = ef4.A01;
            C7384Etj.A0U(immutableList);
            listA0P = AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(obj), immutableList);
            bArr = bArr4;
        } else {
            listA0P = Collections.singletonList(new EEy(C79.A0E, C3432CNc.A02));
            bArr = r4;
        }
        return new EF6(str, bArr, listA0P);
    }
}
