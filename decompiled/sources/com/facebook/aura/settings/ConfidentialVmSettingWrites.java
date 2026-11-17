package com.facebook.aura.settings;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C78W;
import X.C8eO;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.InterfaceC7549F2g;
import com.facebook.aura.permissions.defaults.ConfidentialVmToggle;
import com.facebook.aura.permissions.defaults.ConfidentialVmWriteOutcome;
import com.facebook.aura.permissions.defaults.PermissionSettingsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class ConfidentialVmSettingWrites implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "ConfidentialVmSettingWrites";
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.ConfidentialVmSettingWrites$setAllowed$2", f = "ConfidentialVmSettingWrites.kt", l = {36}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.ConfidentialVmSettingWrites$setAllowed$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super ConfidentialVmWriteOutcome>, Object> {
        public final /* synthetic */ boolean $allowed;
        public final /* synthetic */ ConfidentialVmToggle $toggle;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmToggle confidentialVmToggle, boolean z, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$toggle = confidentialVmToggle;
            this.$allowed = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSettingWrites.this.new AnonymousClass2(this.$toggle, this.$allowed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                PermissionSettingsRepository companion = PermissionSettingsRepository.Companion.getInstance(ConfidentialVmSettingWrites.this.userSession);
                ConfidentialVmToggle confidentialVmToggle = this.$toggle;
                boolean z = this.$allowed;
                this.label = 1;
                obj = companion.setConfidentialVmAllowed(confidentialVmToggle, z, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ConfidentialVmSettingWrites confidentialVmSettingWrites = ConfidentialVmSettingWrites.this;
            if (obj == ConfidentialVmWriteOutcome.APPLIED) {
                AnonymousClass001.A1J(new ConfidentialVmSettingWrites$setAllowed$2$1$1(confidentialVmSettingWrites, null), confidentialVmSettingWrites.scope);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super ConfidentialVmWriteOutcome> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public final Object setAllowed(ConfidentialVmToggle confidentialVmToggle, boolean z, HtJ<? super ConfidentialVmWriteOutcome> htJ) {
        return AnonymousClass001.A10(new AnonymousClass2(confidentialVmToggle, z, null), this.scope).A0E(htJ);
    }

    public final class Companion {
        public final ConfidentialVmSettingWrites getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConfidentialVmSettingWrites) abstractC3358CGz.A03(ConfidentialVmSettingWrites.class, new ConfidentialVmSettingWrites$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConfidentialVmSettingWrites(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = Hxb.A02(C78W.A02(new C8eO(null), AnonymousClass001.A0y()).plus(new ConfidentialVmSettingWrites$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
    }

    public /* synthetic */ ConfidentialVmSettingWrites(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
