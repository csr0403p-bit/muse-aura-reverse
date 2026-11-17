package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.conversation.api.ComposerLaunchAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$ComposerLaunchRequestEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnConsumed$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnDictation$delegate;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnKeyboard$delegate;
    public final /* synthetic */ ComposerLaunchAction $request;

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerLaunchAction.values().length];
            try {
                AnonymousClass002.A13(ComposerLaunchAction.KEYBOARD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ComposerLaunchAction.DICTATION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$ComposerLaunchRequestEffect$1$1(ComposerLaunchAction composerLaunchAction, C1BO<? extends Function0<Unit>> c1bo, C1BO<? extends Function0<Unit>> c1bo2, C1BO<? extends Function0<Unit>> c1bo3) {
        super(1);
        this.$request = composerLaunchAction;
        this.$currentOnKeyboard$delegate = c1bo;
        this.$currentOnDictation$delegate = c1bo2;
        this.$currentOnConsumed$delegate = c1bo3;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        C1BO<Function0<Unit>> c1bo;
        ComposerLaunchAction composerLaunchAction = this.$request;
        if (composerLaunchAction != null) {
            int iOrdinal = composerLaunchAction.ordinal();
            if (iOrdinal == 0) {
                c1bo = this.$currentOnKeyboard$delegate;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                c1bo = this.$currentOnDictation$delegate;
            }
            C1BO.A0D(c1bo);
            C1BO.A0D(this.$currentOnConsumed$delegate);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationContentKt$ComposerLaunchRequestEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
