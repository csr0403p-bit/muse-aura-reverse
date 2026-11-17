package com.facebook.aura.assist;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C0dx;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.accessibility.AuraHaptics;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistInvocationContentKt$AssistUploadEffects$1$1", f = "HatchAssistInvocationContent.kt", l = {114}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistInvocationContentKt$AssistUploadEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchConversationViewModel $conversation;
    public final /* synthetic */ C0dx $haptics;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistInvocationContentKt$AssistUploadEffects$1$1(HatchConversationViewModel hatchConversationViewModel, Context context, C0dx c0dx, HtJ<? super HatchAssistInvocationContentKt$AssistUploadEffects$1$1> htJ) {
        super(2, htJ);
        this.$conversation = hatchConversationViewModel;
        this.$context = context;
        this.$haptics = c0dx;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistInvocationContentKt$AssistUploadEffects$1$1(this.$conversation, this.$context, this.$haptics, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchConversationViewEffect> c22i = this.$conversation.viewEffects;
            final Context context = this.$context;
            final C0dx c0dx = this.$haptics;
            C20Z<? super HatchConversationViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.assist.HatchAssistInvocationContentKt$AssistUploadEffects$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchConversationViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchConversationViewEffect hatchConversationViewEffect, HtJ<? super Unit> htJ) {
                    ToastApi toastApi;
                    int i2;
                    ToastApi toastApi2;
                    int i3;
                    ToastApi toastApi3;
                    Context context2;
                    int i4;
                    int i5;
                    if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowUploadSizeExceeded) {
                        toastApi3 = ToastApi.INSTANCE;
                        context2 = context;
                        i4 = R.string._name_removed__res_0x7f120bf4;
                        i5 = ((HatchConversationViewEffect.ShowUploadSizeExceeded) hatchConversationViewEffect).maxSizeMb;
                    } else {
                        if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowAttachmentUploadFailed) {
                            toastApi2 = ToastApi.INSTANCE;
                            i3 = R.string._name_removed__res_0x7f120ab8;
                        } else if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowAttachmentLimitReached) {
                            toastApi3 = ToastApi.INSTANCE;
                            context2 = context;
                            i4 = R.string._name_removed__res_0x7f120ab7;
                            i5 = 10;
                        } else if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowLiveSessionAttachmentMessage) {
                            toastApi2 = ToastApi.INSTANCE;
                            i3 = ((HatchConversationViewEffect.ShowLiveSessionAttachmentMessage) hatchConversationViewEffect).messageRes;
                        } else if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowUnsendFailed) {
                            toastApi2 = ToastApi.INSTANCE;
                            i3 = R.string._name_removed__res_0x7f12088f;
                        } else {
                            if (!(hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowDictationNoSpeech)) {
                                if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowDictationFailed) {
                                    toastApi = ToastApi.INSTANCE;
                                    i2 = ((HatchConversationViewEffect.ShowDictationFailed) hatchConversationViewEffect).messageRes;
                                } else if (hatchConversationViewEffect instanceof HatchConversationViewEffect.ShowDictationMicSilenced) {
                                    toastApi = ToastApi.INSTANCE;
                                    i2 = R.string._name_removed__res_0x7f120859;
                                } else if (!(hatchConversationViewEffect instanceof HatchConversationViewEffect.DictationCaptureStarted) && !(hatchConversationViewEffect instanceof HatchConversationViewEffect.DictatedTextLanded)) {
                                    if (!(hatchConversationViewEffect instanceof HatchConversationViewEffect.SessionDeleted)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                } else {
                                    c0dx.AXr(AuraHaptics.SUCCESS);
                                }
                                toastApi.showLongToast(i2);
                            }
                            return Unit.INSTANCE;
                        }
                        toastApi2.showToast(i3);
                        return Unit.INSTANCE;
                    }
                    toastApi3.showToast(context2.getString(i4, new Integer(i5)));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAssistInvocationContentKt$AssistUploadEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
