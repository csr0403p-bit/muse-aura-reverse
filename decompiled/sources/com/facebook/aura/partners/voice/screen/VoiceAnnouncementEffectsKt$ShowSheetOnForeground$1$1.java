package com.facebook.aura.partners.voice.screen;

import X.AXN;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.Awn;
import X.C1HY;
import X.C1Ny;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C6ys;
import X.C79;
import X.EnumC10460Hji;
import X.EnumC10573Huf;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.view.View;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.key.HatchVoiceAnnouncementSheetKey;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.utils.HatchNotificationPermissionLauncherKt;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1", f = "VoiceAnnouncementEffects.kt", l = {57}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C1Ny $imeInsets;
    public final /* synthetic */ C1HY $lifecycleOwner;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchSidePanelController $sidePanelController;
    public final /* synthetic */ View $view;
    public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$1", f = "VoiceAnnouncementEffects.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $checkOnMainChat;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ Function0<Boolean> $isMainChatOnTop;
        public final /* synthetic */ Function0<Boolean> $isOverIdleMainChat;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
        public /* synthetic */ Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03011 extends AbstractC7559F3s implements Function0<Boolean> {
            public final /* synthetic */ Context $context;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03011(Context context) {
                super(0);
                this.$context = context;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(HatchNotificationPermissionLauncherKt.isFirstNotificationPromptPending(this.$context));
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$1$2", f = "VoiceAnnouncementEffects.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ G0U<HtJ<? super Unit>, Object> $checkOnMainChat;
            public final /* synthetic */ Function0<Boolean> $isMainChatOnTop;
            public final /* synthetic */ Function0<Boolean> $isOverIdleMainChat;
            public final /* synthetic */ AuraNavigator $navigator;
            public final /* synthetic */ VoiceAnnouncementViewModel $viewModel;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(VoiceAnnouncementViewModel voiceAnnouncementViewModel, Function0<Boolean> function0, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, Function0<Boolean> function02, AuraNavigator auraNavigator, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$viewModel = voiceAnnouncementViewModel;
                this.$isMainChatOnTop = function0;
                this.$checkOnMainChat = g0u;
                this.$isOverIdleMainChat = function02;
                this.$navigator = auraNavigator;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$viewModel, this.$isMainChatOnTop, this.$checkOnMainChat, this.$isOverIdleMainChat, this.$navigator, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    final VoiceAnnouncementViewModel voiceAnnouncementViewModel = this.$viewModel;
                    C22I<Unit> c22i = voiceAnnouncementViewModel.showSheet;
                    final Function0<Boolean> function0 = this.$isMainChatOnTop;
                    final G0U<HtJ<? super Unit>, Object> g0u = this.$checkOnMainChat;
                    final Function0<Boolean> function02 = this.$isOverIdleMainChat;
                    final AuraNavigator auraNavigator = this.$navigator;
                    C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.screen.VoiceAnnouncementEffectsKt.ShowSheetOnForeground.1.1.1.2.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                            if (!AnonymousClass003.A1Y(function0)) {
                                Object objInvoke = g0u.invoke(htJ);
                                if (objInvoke == EnumC10460Hji.A02) {
                                    return objInvoke;
                                }
                            } else if (voiceAnnouncementViewModel.onSheetDue(AnonymousClass003.A1Y(function02))) {
                                auraNavigator.navigate((AuraNavKey) HatchVoiceAnnouncementSheetKey.INSTANCE, false);
                            }
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
                throw C3cG.A0p();
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(VoiceAnnouncementViewModel voiceAnnouncementViewModel, G0U<? super HtJ<? super Unit>, ? extends Object> g0u, Context context, Function0<Boolean> function0, Function0<Boolean> function02, AuraNavigator auraNavigator, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$viewModel = voiceAnnouncementViewModel;
            this.$checkOnMainChat = g0u;
            this.$context = context;
            this.$isMainChatOnTop = function0;
            this.$isOverIdleMainChat = function02;
            this.$navigator = auraNavigator;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, this.$checkOnMainChat, this.$context, this.$isMainChatOnTop, this.$isOverIdleMainChat, this.$navigator, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (this.$viewModel.onForeground(new C03011(this.$context))) {
                    GAo.A02(C79.A0K, C6ys.A00, new AnonymousClass2(this.$viewModel, this.$isMainChatOnTop, this.$checkOnMainChat, this.$isOverIdleMainChat, this.$navigator, null), c3ux);
                    G0U<HtJ<? super Unit>, Object> g0u = this.$checkOnMainChat;
                    this.L$0 = null;
                    this.label = 1;
                    if (g0u.invoke(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1(C1HY c1hy, View view, HatchSidePanelController hatchSidePanelController, C1Ny c1Ny, AXN axn, AuraNavigator auraNavigator, VoiceAnnouncementViewModel voiceAnnouncementViewModel, Context context, HtJ<? super VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1> htJ) {
        super(2, htJ);
        this.$lifecycleOwner = c1hy;
        this.$view = view;
        this.$sidePanelController = hatchSidePanelController;
        this.$imeInsets = c1Ny;
        this.$density = axn;
        this.$navigator = auraNavigator;
        this.$viewModel = voiceAnnouncementViewModel;
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1(this.$lifecycleOwner, this.$view, this.$sidePanelController, this.$imeInsets, this.$density, this.$navigator, this.$viewModel, this.$context, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1 voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1 = new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1(this.$lifecycleOwner, this.$view, this.$sidePanelController, this.$imeInsets, this.$density);
            VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1 voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1 = new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1(this.$navigator);
            VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1 voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1 = new VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1(voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1, this.$viewModel, null);
            C1HY c1hy = this.$lifecycleOwner;
            EnumC10573Huf enumC10573Huf = EnumC10573Huf.A06;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$viewModel, voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$checkOnMainChat$1, this.$context, voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isMainChatOnTop$1, voiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1$isOverIdleMainChat$1, this.$navigator, null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (Awn.A00(enumC10573Huf, c1hy.getLifecycle(), this, anonymousClass1) == enumC10460Hji) {
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
        return ((VoiceAnnouncementEffectsKt$ShowSheetOnForeground$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
