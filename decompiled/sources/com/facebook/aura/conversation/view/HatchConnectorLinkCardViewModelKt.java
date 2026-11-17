package com.facebook.aura.conversation.view;

import X.AnonymousClass002;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;

/* loaded from: classes.dex */
public abstract class HatchConnectorLinkCardViewModelKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SkillState.values().length];
            try {
                AnonymousClass002.A13(SkillState.CONNECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ConnectorCardState toCardState(Skill skill) {
        SkillState skillState;
        int iOrdinal;
        return (skill == null || (skillState = skill.state) == null || (iOrdinal = skillState.ordinal()) == -1) ? ConnectorCardState.Unresolved : iOrdinal != 0 ? ConnectorCardState.NotConnected : ConnectorCardState.Connected;
    }
}
