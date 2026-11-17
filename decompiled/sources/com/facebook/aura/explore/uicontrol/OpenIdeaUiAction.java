package com.facebook.aura.explore.uicontrol;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06G;
import X.C10571Hud;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.R;
import com.facebook.aura.explore.repo.IdeaCardDetail;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import com.facebook.aura.navigation.key.ExploreScreenKey;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiControlItemNavigationKt;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class OpenIdeaUiAction extends C06G implements ContributedUiAction {
    public final String ideaId;

    /* renamed from: com.facebook.aura.explore.uicontrol.OpenIdeaUiAction$perform$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, AuraNavKey> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ AuraNavKey invoke(String str) {
            String str2 = str;
            C7384Etj.A0Y(str2, 0);
            return new ExploreIdeaCardDetailSheetKey(str2);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final AuraNavKey invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            return new ExploreIdeaCardDetailSheetKey(str);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.uicontrol.OpenIdeaUiAction$perform$3", f = "IdeaUiCommands.kt", l = {94}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.uicontrol.OpenIdeaUiAction$perform$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<String, HtJ<? super HsJ<? extends String>>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AbstractC3358CGz abstractC3358CGz, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$userSession, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(String str, HtJ<? super HsJ<? extends String>> htJ) {
            return invoke2(str, (HtJ<? super HsJ<String>>) htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM767fetchCardDetailResultgIAlus;
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaCardsDataSource companion = IdeaCardsDataSource.Companion.getInstance(this.$userSession);
                this.L$0 = null;
                this.label = 1;
                objM767fetchCardDetailResultgIAlus = companion.m767fetchCardDetailResultgIAlus(str, this);
                if (objM767fetchCardDetailResultgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM767fetchCardDetailResultgIAlus = AnonymousClass001.A0q(obj);
            }
            if (!(objM767fetchCardDetailResultgIAlus instanceof C10571Hud)) {
                objM767fetchCardDetailResultgIAlus = ((IdeaCardDetail) objM767fetchCardDetailResultgIAlus).ideaCardId;
            }
            return new HsJ(objM767fetchCardDetailResultgIAlus);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, HtJ<? super HsJ<String>> htJ) {
            return ((AnonymousClass3) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public OpenIdeaUiAction(String str) {
        C7384Etj.A0Y(str, 0);
        this.ideaId = str;
    }

    public final OpenIdeaUiAction copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OpenIdeaUiAction(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenIdeaUiAction) && C7384Etj.areEqual(this.ideaId, ((OpenIdeaUiAction) obj).ideaId));
    }

    public static /* synthetic */ OpenIdeaUiAction copy$default(OpenIdeaUiAction openIdeaUiAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openIdeaUiAction.ideaId;
        }
        C7384Etj.A0Y(str, 0);
        return new OpenIdeaUiAction(str);
    }

    public final String component1() {
        return this.ideaId;
    }

    public final String getIdeaId() {
        return this.ideaId;
    }

    public int hashCode() {
        return this.ideaId.hashCode();
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Object perform(AbstractC3358CGz abstractC3358CGz, HtJ<? super UiActionExecutor.Result> htJ) {
        return UiControlItemNavigationKt.openUiControlItem(abstractC3358CGz, "idea", this.ideaId, ExploreScreenKey.INSTANCE, AnonymousClass2.INSTANCE, new AnonymousClass3(abstractC3358CGz, null), htJ);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return Integer.valueOf(R.drawable.aura_lightbulb_outline);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return new UiSuggestionLabel(R.string._name_removed__res_0x7f120bde, R.string._name_removed__res_0x7f120bee);
    }

    public String toString() {
        return super.toString();
    }
}
