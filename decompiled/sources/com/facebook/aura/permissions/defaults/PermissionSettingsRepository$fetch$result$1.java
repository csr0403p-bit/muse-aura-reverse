package com.facebook.aura.permissions.defaults;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC2261BLa;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.common.coroutines.SingleFlightResult;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$result$1", f = "PermissionSettingsRepository.kt", l = {74}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PermissionSettingsRepository$fetch$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super SingleFlightResult<? extends HsJ<? extends PermissionSettings>>>, Object> {
    public int label;
    public final /* synthetic */ PermissionSettingsRepository this$0;

    @DebugMetadata(c = "com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$result$1$1", f = "PermissionSettingsRepository.kt", l = {HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 74}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.permissions.defaults.PermissionSettingsRepository$fetch$result$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends PermissionSettings>>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ PermissionSettingsRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PermissionSettingsRepository permissionSettingsRepository, HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
            this.this$0 = permissionSettingsRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass1(this.this$0, htJ);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HtJ<? super HsJ<PermissionSettings>> htJ) {
            return new AnonymousClass1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            PermissionSettingsRepository permissionSettingsRepository;
            InterfaceC2261BLa interfaceC2261BLa;
            Object objM1848getIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    permissionSettingsRepository = this.this$0;
                    interfaceC2261BLa = permissionSettingsRepository.requestLock;
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = permissionSettingsRepository;
                    this.label = 1;
                    if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        try {
                            objM1848getIoAF18A = AnonymousClass001.A0q(obj);
                            HsJ hsJA0t = C3cG.A0t(objM1848getIoAF18A);
                            interfaceC2261BLa.Ahe(null);
                            return hsJA0t;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC2261BLa.Ahe(null);
                            throw th;
                        }
                    }
                    permissionSettingsRepository = (PermissionSettingsRepository) this.L$1;
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                }
                this.L$0 = interfaceC2261BLa;
                this.L$1 = null;
                this.label = 2;
                objM1848getIoAF18A = permissionSettingsRepository.m1848getIoAF18A(this);
                if (objM1848getIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
                HsJ hsJA0t2 = C3cG.A0t(objM1848getIoAF18A);
                interfaceC2261BLa.Ahe(null);
                return hsJA0t2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends PermissionSettings>> htJ) {
            return invoke2((HtJ<? super HsJ<PermissionSettings>>) htJ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PermissionSettingsRepository$fetch$result$1(PermissionSettingsRepository permissionSettingsRepository, HtJ<? super PermissionSettingsRepository$fetch$result$1> htJ) {
        super(2, htJ);
        this.this$0 = permissionSettingsRepository;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PermissionSettingsRepository$fetch$result$1(this.this$0, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super SingleFlightResult<HsJ<PermissionSettings>>> htJ) {
        return new PermissionSettingsRepository$fetch$result$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            PermissionSettingsRepository permissionSettingsRepository = this.this$0;
            SingleFlight singleFlight = permissionSettingsRepository.fetchSingleFlight;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(permissionSettingsRepository, null);
            this.label = 1;
            obj = singleFlight.invoke(Unit.INSTANCE, anonymousClass1, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super SingleFlightResult<? extends HsJ<? extends PermissionSettings>>> htJ) {
        return invoke2(c3ux, (HtJ<? super SingleFlightResult<HsJ<PermissionSettings>>>) htJ);
    }
}
