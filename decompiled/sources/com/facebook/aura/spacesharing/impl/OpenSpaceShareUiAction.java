package com.facebook.aura.spacesharing.impl;

import X.AbstractC7559F3s;
import X.C06G;
import X.C7384Etj;
import X.G0U;
import X.HtJ;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.key.SpaceInviteScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import com.facebook.aura.uicontrol.UiControlNavigationHost;
import com.facebook.aura.uicontrol.UiSuggestionLabel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class OpenSpaceShareUiAction extends C06G implements ContributedUiAction {
    public final String spaceSlug;

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction", f = "SpaceShareUiCommands.kt", l = {97, 117}, m = "perform", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OpenSpaceShareUiAction.this.perform(null, this);
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<UiControlNavigationHost, UiActionExecutor.Result> {
        @Override // X.G0U
        public final UiActionExecutor.Result invoke(UiControlNavigationHost uiControlNavigationHost) {
            UiActionExecutor.Result unsupported;
            SpacesModalScreenKey spacesModalScreenKey;
            C7384Etj.A0Y(uiControlNavigationHost, 0);
            AuraNavigator auraNavigator = uiControlNavigationHost.navigator;
            if (auraNavigator.currentKey(true) instanceof AuraOverlayNavKey) {
                unsupported = new UiActionExecutor.Result.Unsupported("Something is open in front of the app, such as the app lock, so the Share settings were not opened.", "unavailable");
            } else {
                SpaceInviteScreenKey spaceInviteScreenKey = new SpaceInviteScreenKey(OpenSpaceShareUiAction.this.spaceSlug);
                if (!C7384Etj.areEqual(auraNavigator.currentKey(true), spaceInviteScreenKey)) {
                    AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(true);
                    if (!C7384Etj.areEqual((!(auraNavKeyCurrentKey instanceof SpacesModalScreenKey) || (spacesModalScreenKey = (SpacesModalScreenKey) auraNavKeyCurrentKey) == null) ? null : spacesModalScreenKey.slug, OpenSpaceShareUiAction.this.spaceSlug)) {
                        auraNavigator.navigate((AuraNavKey) new SpacesModalScreenKey(OpenSpaceShareUiAction.this.spaceSlug, null, false), false);
                    }
                    auraNavigator.navigate((AuraNavKey) spaceInviteScreenKey, false);
                }
                unsupported = C7384Etj.areEqual(auraNavigator.currentKey(true), spaceInviteScreenKey) ? UiActionExecutor.Result.Performed.INSTANCE : new UiActionExecutor.Result.Unsupported("Share settings did not open", null);
            }
            return unsupported;
        }

        public AnonymousClass2() {
            super(1);
        }
    }

    public OpenSpaceShareUiAction(String str) {
        C7384Etj.A0Y(str, 0);
        this.spaceSlug = str;
    }

    public final OpenSpaceShareUiAction copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new OpenSpaceShareUiAction(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OpenSpaceShareUiAction) && C7384Etj.areEqual(this.spaceSlug, ((OpenSpaceShareUiAction) obj).spaceSlug));
    }

    public static /* synthetic */ OpenSpaceShareUiAction copy$default(OpenSpaceShareUiAction openSpaceShareUiAction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openSpaceShareUiAction.spaceSlug;
        }
        C7384Etj.A0Y(str, 0);
        return new OpenSpaceShareUiAction(str);
    }

    public final String component1() {
        return this.spaceSlug;
    }

    public final String getSpaceSlug() {
        return this.spaceSlug;
    }

    public int hashCode() {
        return this.spaceSlug.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object perform(X.AbstractC3358CGz r9, X.HtJ<? super com.facebook.aura.uicontrol.UiActionExecutor.Result> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction.AnonymousClass1
            if (r0 == 0) goto La4
            r5 = r10
            com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$1 r5 = (com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La4
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r7 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r3 = "unavailable"
            r4 = 2
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L45
            if (r0 != r4) goto Lab
            X.Hwg.A00(r7)
        L25:
            if (r7 != 0) goto L2e
            java.lang.String r0 = "The app is not on screen, so the Share settings were not opened. Ask the user to open the app and try again."
        L29:
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r7 = new com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported
            r7.<init>(r0, r3)
        L2e:
            return r7
        L2f:
            X.Hwg.A00(r7)
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$Companion r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.Companion
            com.facebook.aura.library.repo.UnifiedArtifactsRepository r1 = r0.getInstance(r9)
            java.lang.String r0 = r8.spaceSlug
            r5.L$0 = r9
            r5.label = r2
            java.lang.Object r7 = r1.lookUpSpaceBySlug(r0, r5)
            if (r7 != r6) goto L4b
            return r6
        L45:
            java.lang.Object r0 = r5.L$0
            X.CGz r9 = X.C60O.A0D(r0, r7)
        L4b:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult r7 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult) r7
            boolean r0 = r7 instanceof com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found
            if (r0 == 0) goto L65
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Found r7 = (com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Found) r7
            com.facebook.aura.library.repo.UnifiedArtifact r0 = r7.artifact
            boolean r0 = com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt.canOpenShareSettings(r0, r9)
            if (r0 != 0) goto L78
            java.lang.String r1 = "Sharing is not available for this artifact"
            java.lang.String r0 = "unsupported"
        L5f:
            com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported r7 = new com.facebook.aura.uicontrol.UiActionExecutor$Result$Unsupported
            r7.<init>(r1, r0)
            return r7
        L65:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Missing r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Missing.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r7, r0)
            if (r0 == 0) goto L91
            java.lang.String r1 = r8.spaceSlug
            java.lang.String r0 = "Artifact not found: "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "not_found"
            goto L5f
        L78:
            com.facebook.aura.uicontrol.UiControlActionSink$Companion r0 = com.facebook.aura.uicontrol.UiControlActionSink.Companion
            com.facebook.aura.uicontrol.UiControlActionSink r2 = r0.getInstance(r9)
            com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$2 r1 = new com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$2
            r1.<init>()
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.label = r4
            java.lang.Object r7 = r2.withVisibleNavigationHost(r1, r5)
            if (r7 != r6) goto L25
            return r6
        L91:
            com.facebook.aura.library.repo.UnifiedArtifactsRepository$SpaceLookupResult$Failed r0 = com.facebook.aura.library.repo.UnifiedArtifactsRepository.SpaceLookupResult.Failed.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r7, r0)
            if (r0 == 0) goto Lb0
            java.lang.String r2 = r8.spaceSlug
            java.lang.String r1 = "Could not load artifact "
            java.lang.String r0 = ", so its Share settings were not opened."
            java.lang.String r0 = X.FGI.A0U(r1, r2, r0)
            goto L29
        La4:
            com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$1 r5 = new com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction$perform$1
            r5.<init>(r10)
            goto L12
        Lab:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Lb0:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spacesharing.impl.OpenSpaceShareUiAction.perform(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public Integer getIconRes() {
        return Integer.valueOf(R.drawable.userbadgeplus_outline_24_wght400);
    }

    @Override // com.facebook.aura.uicontrol.ContributedUiAction
    public UiSuggestionLabel getSuggestionLabel() {
        return new UiSuggestionLabel(R.string._name_removed__res_0x7f121001, R.string._name_removed__res_0x7f120bee);
    }

    public String toString() {
        return super.toString();
    }
}
