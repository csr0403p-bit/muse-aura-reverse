package X;

import com.facebook.flexiblesampling.SamplingPolicyConfig;

/* renamed from: X.Cl4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4061Cl4 {
    public final Class<? extends InterfaceC4071ClJ> A00;
    public final Class<? extends SamplingPolicyConfig> A01;
    public final Class<? extends InterfaceC4012Cjq> A02;
    public final Integer A03;
    public final String A04;

    public static RuntimeException A00(C4061Cl4 c4061Cl4, Throwable th) {
        return new RuntimeException(FGI.A0M("Failed to create instance of ", c4061Cl4.A02.getName()), th);
    }

    public C4061Cl4(Class cls, Class cls2, Class cls3, Integer num, String str) {
        this.A02 = cls;
        this.A01 = cls2;
        this.A03 = num;
        this.A04 = str;
        this.A00 = cls3;
    }
}
