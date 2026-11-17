package com.facebook.aura.login.nativeflow;

import X.A3q;
import X.AGH;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0881AGi;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.login.credentials.AuraRememberedAccount;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1", f = "NativeLoginViewModel.kt", l = {870}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class NativeLoginViewModel$readRememberedMuseProfiles$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Map<String, ? extends HatchMuseProfile>>, Object> {
    public final /* synthetic */ int $generation;
    public final /* synthetic */ List<AuraRememberedAccount> $remembered;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ NativeLoginViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1$1", f = "NativeLoginViewModel.kt", l = {884}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$readRememberedMuseProfiles$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>>, Object> {
        public final /* synthetic */ C3UX $$this$async;
        public final /* synthetic */ int $generation;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ NativeLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C3UX c3ux, NativeLoginViewModel nativeLoginViewModel, int i, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$$this$async = c3ux;
            this.this$0 = nativeLoginViewModel;
            this.$generation = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$async, this.this$0, this.$generation, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends List<? extends HatchSavedAccount>>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<? extends List<HatchSavedAccount>>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                NativeLoginViewModel.SavedAccountsRead savedAccountsRead = new NativeLoginViewModel.SavedAccountsRead(str, AnonymousClass001.A10(new NativeLoginViewModel$readRememberedMuseProfiles$1$1$1$read$1(this.this$0, str, null), this.$$this$async));
                NativeLoginViewModel nativeLoginViewModel = this.this$0;
                Object obj2 = nativeLoginViewModel.landingReadLock;
                int i2 = this.$generation;
                synchronized (obj2) {
                    if (i2 == nativeLoginViewModel.landingReadGeneration) {
                        nativeLoginViewModel.landingSavedAccounts = savedAccountsRead;
                    }
                }
                C27k<HsJ<List<HatchSavedAccount>>> c27k = savedAccountsRead.result;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = C3cG.A0W(c27k, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HsJ hsJ = (HsJ) obj;
            return C3cG.A0t(hsJ != null ? hsJ.value : this.this$0.m1322tempTokenUnavailabled1pmJ48());
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<? extends List<HatchSavedAccount>>> htJ) {
            return ((AnonymousClass1) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginViewModel$readRememberedMuseProfiles$1$1(List<AuraRememberedAccount> list, NativeLoginViewModel nativeLoginViewModel, int i, HtJ<? super NativeLoginViewModel$readRememberedMuseProfiles$1$1> htJ) {
        super(2, htJ);
        this.$remembered = list;
        this.this$0 = nativeLoginViewModel;
        this.$generation = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NativeLoginViewModel$readRememberedMuseProfiles$1$1 nativeLoginViewModel$readRememberedMuseProfiles$1$1 = new NativeLoginViewModel$readRememberedMuseProfiles$1$1(this.$remembered, this.this$0, this.$generation, htJ);
        nativeLoginViewModel$readRememberedMuseProfiles$1$1.L$0 = obj;
        return nativeLoginViewModel$readRememberedMuseProfiles$1$1;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Map<String, ? extends HatchMuseProfile>> htJ) {
        return invoke2(c3ux, (HtJ<? super Map<String, HatchMuseProfile>>) htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objMuseProfilesForPicker = obj;
        C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(objMuseProfilesForPicker);
            List<AuraRememberedAccount> list = NativeLoginAccountResolver.INSTANCE.pickerRows(this.$remembered, C0881AGi.A00, 5, A3q.A00, AGH.A0E()).remembered;
            NativeLoginViewModel nativeLoginViewModel = this.this$0;
            NativeLoginRememberedAccounts nativeLoginRememberedAccounts = nativeLoginViewModel.rememberedAccounts;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c3ux, nativeLoginViewModel, this.$generation, null);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            objMuseProfilesForPicker = nativeLoginRememberedAccounts.museProfilesForPicker(list, anonymousClass1, this);
            if (objMuseProfilesForPicker == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objMuseProfilesForPicker);
        }
        return objMuseProfilesForPicker;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super Map<String, HatchMuseProfile>> htJ) {
        return ((NativeLoginViewModel$readRememberedMuseProfiles$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
