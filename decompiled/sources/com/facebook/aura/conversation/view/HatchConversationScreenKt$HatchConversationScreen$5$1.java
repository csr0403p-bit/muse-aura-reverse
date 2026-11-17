package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C0dx;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1", f = "HatchConversationScreen.kt", l = {214}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $attachmentLimitReachedMessage;
    public final /* synthetic */ String $attachmentUploadFailedMessage;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $dictationFailedMessage;
    public final /* synthetic */ String $dictationFailedOfflineMessage;
    public final /* synthetic */ String $dictationMicSilencedMessage;
    public final /* synthetic */ String $dictationNoSpeechMessage;
    public final /* synthetic */ C0dx $haptics;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $unsendFailedMessage;
    public final /* synthetic */ View $view;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$5$1(HatchConversationViewModel hatchConversationViewModel, View view, Context context, String str, String str2, String str3, String str4, String str5, C0dx c0dx, AuraNavigator auraNavigator, String str6, String str7, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$5$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConversationViewModel;
        this.$view = view;
        this.$context = context;
        this.$attachmentUploadFailedMessage = str;
        this.$attachmentLimitReachedMessage = str2;
        this.$unsendFailedMessage = str3;
        this.$dictationNoSpeechMessage = str4;
        this.$dictationMicSilencedMessage = str5;
        this.$haptics = c0dx;
        this.$navigator = auraNavigator;
        this.$dictationFailedOfflineMessage = str6;
        this.$dictationFailedMessage = str7;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationScreenKt$HatchConversationScreen$5$1 hatchConversationScreenKt$HatchConversationScreen$5$1 = new HatchConversationScreenKt$HatchConversationScreen$5$1(this.$viewModel, this.$view, this.$context, this.$attachmentUploadFailedMessage, this.$attachmentLimitReachedMessage, this.$unsendFailedMessage, this.$dictationNoSpeechMessage, this.$dictationMicSilencedMessage, this.$haptics, this.$navigator, this.$dictationFailedOfflineMessage, this.$dictationFailedMessage, htJ);
        hatchConversationScreenKt$HatchConversationScreen$5$1.L$0 = obj;
        return hatchConversationScreenKt$HatchConversationScreen$5$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        final C3UX c3ux = (C3UX) this.L$0;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchConversationViewEffect> c22i = this.$viewModel.viewEffects;
            final View view = this.$view;
            final Context context = this.$context;
            final String str = this.$attachmentUploadFailedMessage;
            final String str2 = this.$attachmentLimitReachedMessage;
            final String str3 = this.$unsendFailedMessage;
            final String str4 = this.$dictationNoSpeechMessage;
            final String str5 = this.$dictationMicSilencedMessage;
            final C0dx c0dx = this.$haptics;
            final AuraNavigator auraNavigator = this.$navigator;
            final String str6 = this.$dictationFailedOfflineMessage;
            final String str7 = this.$dictationFailedMessage;
            C20Z<? super HatchConversationViewEffect> c20z = new C20Z() { // from class: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1.1

                @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1$1$1", f = "HatchConversationScreen.kt", l = {239}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C01031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                    public final /* synthetic */ String $dictationFailedMessage;
                    public final /* synthetic */ String $dictationFailedOfflineMessage;
                    public final /* synthetic */ HatchConversationViewEffect $effect;
                    public final /* synthetic */ View $view;
                    public int label;

                    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1$1$1$1", f = "HatchConversationScreen.kt", l = {239}, m = "invokeSuspend", v = 2)
                    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1$1$1$1, reason: invalid class name and collision with other inner class name */
                    public final class C01041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                        public final /* synthetic */ View $view;
                        public int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C01041(View view, HtJ<? super C01041> htJ) {
                            super(2, htJ);
                            this.$view = view;
                        }

                        @Override // X.AbstractC8884Fsp
                        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                            return new C01041(this.$view, htJ);
                        }

                        @Override // X.AbstractC8884Fsp
                        public final Object invokeSuspend(Object obj) {
                            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                            int i = this.label;
                            if (i == 0) {
                                Hwg.A00(obj);
                                View view = this.$view;
                                this.label = 1;
                                if (HatchConversationScreenKt.awaitImeVisible(view, this) == enumC10460Hji) {
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
                            return new C01041(this.$view, htJ).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01031(HatchConversationViewEffect hatchConversationViewEffect, View view, String str, String str2, HtJ<? super C01031> htJ) {
                        super(2, htJ);
                        this.$effect = hatchConversationViewEffect;
                        this.$view = view;
                        this.$dictationFailedOfflineMessage = str;
                        this.$dictationFailedMessage = str2;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new C01031(this.$effect, this.$view, this.$dictationFailedOfflineMessage, this.$dictationFailedMessage, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                        int i = this.label;
                        if (i == 0) {
                            Hwg.A00(obj);
                            if (((HatchConversationViewEffect.ShowDictationFailed) this.$effect).opensKeyboard) {
                                C01041 c01041 = new C01041(this.$view, null);
                                this.label = 1;
                                if (GAX.A01(this, c01041, 1000L) == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw AnonymousClass001.A0n();
                            }
                            Hwg.A00(obj);
                        }
                        AnonymousClass007.A0m(this.$view, AuraToast.Companion, ((HatchConversationViewEffect.ShowDictationFailed) this.$effect).messageRes == R.string._name_removed__res_0x7f120858 ? this.$dictationFailedOfflineMessage : this.$dictationFailedMessage);
                        return Unit.INSTANCE;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                        return ((C01031) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* renamed from: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1$1$2, reason: invalid class name */
                public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                    public AnonymousClass2() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return Boolean.valueOf(auraNavKey instanceof ConversationScreenKey);
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchConversationViewEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect r22, X.HtJ<? super kotlin.Unit> r23) {
                    /*
                        Method dump skipped, instructions count: 243
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$5$1.AnonymousClass1.emit(com.facebook.aura.conversation.viewmodel.HatchConversationViewEffect, X.HtJ):java.lang.Object");
                }
            };
            this.L$0 = null;
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
        return ((HatchConversationScreenKt$HatchConversationScreen$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
