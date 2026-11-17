package com.facebook.aura.login.nativeflow;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1", f = "NativeLoginViewModel.kt", l = {874}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
    public final /* synthetic */ String $idForAymh;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1$1", f = "NativeLoginViewModel.kt", l = {875}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
        public final /* synthetic */ String $idForAymh;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$idForAymh = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$idForAymh, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1262savedAccounts0E7RQCE;
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAuthApi hatchAuthApi = HatchAuthApi.INSTANCE;
                String str2 = this.$idForAymh;
                this.L$0 = null;
                this.label = 1;
                objM1262savedAccounts0E7RQCE = hatchAuthApi.m1262savedAccounts0E7RQCE(str, str2, this);
                if (objM1262savedAccounts0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1262savedAccounts0E7RQCE = AnonymousClass001.A0q(obj);
            }
            return C3cG.A0t(objM1262savedAccounts0E7RQCE);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
            return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1(NativeLoginViewModel nativeLoginViewModel, String str, HtJ<? super NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1> htJ) {
        super(2, htJ);
        this.this$0 = nativeLoginViewModel;
        this.$idForAymh = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1(this.this$0, this.$idForAymh, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            NativeLoginViewModel nativeLoginViewModel = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$idForAymh, null);
            this.label = 1;
            obj = nativeLoginViewModel.m1324withTempTokenRgG5Fkc(false, anonymousClass1, this);
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

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
        return ((NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
