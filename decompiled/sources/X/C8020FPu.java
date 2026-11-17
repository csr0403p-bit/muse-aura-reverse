package X;

import com.facebook.aura.R;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.FPu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8020FPu<ModelType, StateType> {
    public static final C8020FPu<?, ?> A03 = new C8020FPu<>(null, "empty", C0881AGi.A00);
    public String A00;
    public final C8020FPu<?, ?> A01;
    public final List A02;

    public final void A00(FQ0 fq0) {
        Integer num;
        FDW fdw;
        int i;
        Map<String, FQ5> map = fq0.A04;
        String str = this.A00;
        if (map.containsKey(str)) {
            C7384Etj.A0X(map.get(str));
        }
        for (FQ9 fq9 : this.A02) {
            if (fq9 == null) {
                throw BV4.A0U();
            }
            FBB fbb = fq9.A02.get();
            if (fbb != null) {
                FQE fqe = fq9.A00;
                Map<FDW, C7686FAf> map2 = fqe.A01.A01.get(fqe.A00);
                if (map2 != null) {
                    HashSet hashSet = new HashSet(map2.values());
                    if (map.containsKey(str)) {
                        FQ5 fq5 = map.get(str);
                        C7384Etj.A0X(fq5);
                        num = fq5.A00;
                    } else {
                        num = C79.A00;
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        C7686FAf c7686FAf = (C7686FAf) it.next();
                        String str2 = c7686FAf.A03;
                        int iIntValue = num.intValue();
                        if (iIntValue != 0) {
                            fdw = c7686FAf.A01;
                            i = 36;
                            if (iIntValue != 2) {
                                i = 40;
                            }
                        } else {
                            fdw = c7686FAf.A01;
                            i = 35;
                        }
                        HsM hsMA0D = fdw.A0D(i);
                        AuraImpressionTimeTracker auraImpressionTimeTracker = fq9.A01;
                        F6D f6dA01 = c7686FAf.A00;
                        if (f6dA01 == null) {
                            f6dA01 = F6D.A01(fbb, c7686FAf.A02);
                        }
                        C8023FPz c8023FPz = new C8023FPz(this, fq0, Long.valueOf(auraImpressionTimeTracker.getLastImpressionTimeInMs(str2)), auraImpressionTimeTracker.hasSeenBefore(str2));
                        if (num == C79.A00) {
                            if (hsMA0D != null) {
                                if (c7686FAf.A04) {
                                    FQK fqk = (FQK) fbb.A04(FQ9.A03, fdw, R.id.bk_context_key_visibility_extension_first_appear);
                                    if (!fqk.A00) {
                                        fqk.A00 = true;
                                    }
                                }
                                auraImpressionTimeTracker.updateImpressionTime(str2);
                                AbstractC7691FAk.A02(f6dA01, C9115Fyg.A01(c8023FPz), hsMA0D, fbb, 1);
                            }
                        } else if (hsMA0D != null) {
                            AbstractC7691FAk.A02(f6dA01, C9115Fyg.A01(c8023FPz), hsMA0D, fbb, 1);
                        }
                    }
                }
            }
        }
    }

    public C8020FPu(C8020FPu c8020FPu, String str, List list) {
        this.A00 = str;
        this.A02 = list;
        this.A01 = c8020FPu;
    }
}
