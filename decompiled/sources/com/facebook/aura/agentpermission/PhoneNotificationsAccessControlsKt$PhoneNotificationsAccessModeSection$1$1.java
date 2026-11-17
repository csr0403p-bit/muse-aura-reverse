package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.C4Ax;
import X.C78T;
import X.C8hv;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.PhoneNotificationsAccessMode;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1", f = "PhoneNotificationsAccessControls.kt", l = {80}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Set<String>> $blockedApps$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<List<C4Ax>> $installedApps$delegate;
    public final /* synthetic */ MutableState<Boolean> $isLoadingApps$delegate;
    public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
    public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1$1", f = "PhoneNotificationsAccessControls.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<Set<String>> $blockedApps$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<List<C4Ax>> $installedApps$delegate;
        public final /* synthetic */ MutableState<Boolean> $isLoadingApps$delegate;
        public final /* synthetic */ HatchGatewayPrefsStore $prefsStore;
        public final /* synthetic */ MutableState<PhoneNotificationsAccessMode> $readMode$delegate;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, MutableState<PhoneNotificationsAccessMode> mutableState, MutableState<Set<String>> mutableState2, MutableState<List<C4Ax>> mutableState3, MutableState<Boolean> mutableState4, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$prefsStore = hatchGatewayPrefsStore;
            this.$context = context;
            this.$readMode$delegate = mutableState;
            this.$blockedApps$delegate = mutableState2;
            this.$installedApps$delegate = mutableState3;
            this.$isLoadingApps$delegate = mutableState4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$prefsStore, this.$context, this.$readMode$delegate, this.$blockedApps$delegate, this.$installedApps$delegate, this.$isLoadingApps$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            this.$readMode$delegate.Af8(this.$prefsStore.getPhoneNotificationsAccessMode());
            this.$blockedApps$delegate.Af8(this.$prefsStore.getPhoneNotificationsAccessBlockedApps());
            this.$installedApps$delegate.Af8(C8hv.A00.A01(this.$context));
            MutableState.A09(false, this.$isLoadingApps$delegate);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1(HatchGatewayPrefsStore hatchGatewayPrefsStore, Context context, MutableState<PhoneNotificationsAccessMode> mutableState, MutableState<Set<String>> mutableState2, MutableState<List<C4Ax>> mutableState3, MutableState<Boolean> mutableState4, HtJ<? super PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1> htJ) {
        super(2, htJ);
        this.$prefsStore = hatchGatewayPrefsStore;
        this.$context = context;
        this.$readMode$delegate = mutableState;
        this.$blockedApps$delegate = mutableState2;
        this.$installedApps$delegate = mutableState3;
        this.$isLoadingApps$delegate = mutableState4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1(this.$prefsStore, this.$context, this.$readMode$delegate, this.$blockedApps$delegate, this.$installedApps$delegate, this.$isLoadingApps$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            C78T c78tA0s = AnonymousClass002.A0s(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$prefsStore, this.$context, this.$readMode$delegate, this.$blockedApps$delegate, this.$installedApps$delegate, this.$isLoadingApps$delegate, null);
            this.label = 1;
            if (GAo.A00(this, c78tA0s, anonymousClass1) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((PhoneNotificationsAccessControlsKt$PhoneNotificationsAccessModeSection$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
