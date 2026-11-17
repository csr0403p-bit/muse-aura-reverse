package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.AuraInviteFriendSheetKt$AuraInviteGift$1$1", f = "AuraInviteFriendSheet.kt", l = {540}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraInviteFriendSheetKt$AuraInviteGift$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HxE<String, String> $clipIdentity;
    public final /* synthetic */ MutableState<Boolean> $hasVideoFailed$delegate;
    public final /* synthetic */ MutableState<Boolean> $hasVideoRendered$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteFriendSheetKt$AuraInviteGift$1$1(HxE<String, String> hxE, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HtJ<? super AuraInviteFriendSheetKt$AuraInviteGift$1$1> htJ) {
        super(2, htJ);
        this.$clipIdentity = hxE;
        this.$hasVideoRendered$delegate = mutableState;
        this.$hasVideoFailed$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraInviteFriendSheetKt$AuraInviteGift$1$1(this.$clipIdentity, this.$hasVideoRendered$delegate, this.$hasVideoFailed$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$clipIdentity != null) {
                this.label = 1;
                if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!MutableState.A0A((MutableState) this.$hasVideoRendered$delegate)) {
            MutableState.A09(true, this.$hasVideoFailed$delegate);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((AuraInviteFriendSheetKt$AuraInviteGift$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
