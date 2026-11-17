package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HeaderLeadingButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$5$3$1 extends AbstractC7559F3s implements G0U<HeaderLeadingButton, Unit> {
    public final /* synthetic */ Function0<Unit> $onBackClick;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderLeadingButton.values().length];
            try {
                AnonymousClass002.A13(HeaderLeadingButton.SidePanel, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HeaderLeadingButton.Back, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$5$3$1(Function0<Unit> function0) {
        super(1);
        this.$onBackClick = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderLeadingButton headerLeadingButton) {
        int iA0L = AnonymousClass003.A0L(headerLeadingButton);
        if (iA0L == 2) {
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchScreen.MAIN_CHAT, HatchComponent.THREADS_BUTTON, null, null, null);
        } else if (iA0L == 3) {
            this.$onBackClick.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderLeadingButton headerLeadingButton) {
        invoke2(headerLeadingButton);
        return Unit.INSTANCE;
    }
}
