package com.facebook.aura.skills.connect;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.skills.connect.ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1", f = "ConnectorAuthQplEffects.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ Skill $skill;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1(boolean z, Skill skill, HtJ<? super ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1> htJ) {
        super(2, htJ);
        this.$isLoading = z;
        this.$skill = skill;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1(this.$isLoading, this.$skill, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Skill skill;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!this.$isLoading && (skill = this.$skill) != null) {
            HatchConnectorQplLogger.INSTANCE.markConsentSheetLoaded(AnonymousClass002.A1Z(skill.state, SkillState.CONNECTED));
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConnectorAuthQplEffectsKt$ConnectorAuthConsentQplEffects$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
