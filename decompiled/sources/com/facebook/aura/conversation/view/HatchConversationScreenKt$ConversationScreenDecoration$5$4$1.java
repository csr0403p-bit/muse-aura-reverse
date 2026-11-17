package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.invite.HatchInviteBadgeRepository;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationScreenDecoration$5$4$1 extends AbstractC7559F3s implements G0U<HeaderButton, Unit> {
    public final /* synthetic */ HatchInviteBadgeRepository $inviteBadgeRepository;
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ Function0<Unit> $onInviteFriendsClick;
    public final /* synthetic */ Function0<Unit> $onSearchClick;
    public final /* synthetic */ MutableState<Boolean> $showThreadMenu$delegate;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ HatchScreen $threadScreen;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderButton.values().length];
            try {
                AnonymousClass002.A13(HeaderButton.Search, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HeaderButton.InviteFriends, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HeaderButton.MoreOptions, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$ConversationScreenDecoration$5$4$1(Function0<Unit> function0, HatchInviteBadgeRepository hatchInviteBadgeRepository, Function0<Unit> function02, boolean z, HatchScreen hatchScreen, Map<String, String> map, MutableState<Boolean> mutableState) {
        super(1);
        this.$onSearchClick = function0;
        this.$inviteBadgeRepository = hatchInviteBadgeRepository;
        this.$onInviteFriendsClick = function02;
        this.$isMainTab = z;
        this.$threadScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$showThreadMenu$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HeaderButton headerButton) {
        Function0<Unit> function0;
        int iA0L = AnonymousClass003.A0L(headerButton);
        if (iA0L == 2) {
            function0 = this.$onSearchClick;
        } else {
            if (iA0L != 4) {
                if (iA0L != 1 || this.$isMainTab) {
                    return;
                }
                HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, this.$threadScreen, HatchComponent.THREE_DOTS_MENU, null, this.$threadLogMetadata, null);
                MutableState.A09(true, this.$showThreadMenu$delegate);
                return;
            }
            this.$inviteBadgeRepository.markBadgeSeen();
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.HEADER, HatchScreen.MAIN_CHAT, HatchComponent.INVITE_FRIENDS_PILL, null, null, null);
            function0 = this.$onInviteFriendsClick;
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HeaderButton headerButton) {
        invoke2(headerButton);
        return Unit.INSTANCE;
    }
}
