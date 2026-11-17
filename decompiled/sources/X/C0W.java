package X;

import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: classes5.dex */
public final class C0W implements C0S {
    public static final C0X A04 = new C0X();
    public String A00;
    public final HeroPlayerSetting A01;
    public final C0S A02;
    public final C3167C0s A03;

    @Override // X.C0S
    public final void AS3() {
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    @Override // X.C0S
    public final void Acy(String str) {
        if (str == null) {
            str = this.A00;
        }
        this.A00 = str;
    }

    public C0W(C0S c0s, C3167C0s c3167C0s, HeroPlayerSetting heroPlayerSetting, String str) {
        this.A02 = c0s;
        this.A01 = heroPlayerSetting;
        this.A00 = str;
        this.A03 = c3167C0s;
    }

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
        int iA1b = AnonymousClass004.A1b(str, str2);
        this.A02.AT3(str, str2, i, i2);
        if (this.A03 != null) {
            Ey9 ey9 = DES.A01;
            AbstractC3160C0i.A00(str2);
            AbstractC3426CMt.A03("ServiceEventCallbackImpl", "skipping log because listener is null for event type: ", new Object[iA1b]);
        }
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        this.A02.AW3(interfaceC3158C0g, c0j);
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        this.A02.AW4(interfaceC3158C0g, c0j);
    }

    @Override // X.C0R
    public final void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
        AnonymousClass005.A14(interfaceC3158C0g, c0j, c0j2, num);
        this.A02.AW5(interfaceC3158C0g, c0j, c0j2, num);
    }

    @Override // X.C0S
    public final void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
        AnonymousClass003.A0u(interfaceC3158C0g, str);
        this.A02.AWA(interfaceC3158C0g, str, j, j2);
    }
}
