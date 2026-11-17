package com.facebook.aura.spaces.conversation;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10571Hud;
import X.C1BO;
import X.C1DM;
import X.C2CK;
import X.C3UV;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetData;
import com.facebook.aura.model.OpaqueWidgetData;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SharedSpaceWidgetRendererKt {
    public static final String SHARED_SPACE_KIND = "shared_space";

    /* renamed from: SharedSpaceCard-sW7UJKQ, reason: not valid java name */
    public static final void m2177SharedSpaceCardsW7UJKQ(SharedSpace sharedSpace, long j, C1DM c1dm, BRg bRg, BFM bfm, int i, int i2) {
        Object next;
        ArtifactOpenTarget.PeerSpace peerSpace;
        String str;
        UnifiedArtifact unifiedArtifact;
        BRg bRg2 = bRg;
        bfm.AgG(-998741401);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, sharedSpace) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, c1dm);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            UnifiedArtifactsRepository unifiedArtifactsRepository = (UnifiedArtifactsRepository) objAaT;
            C1BO c1boA02 = C2CK.A02(bfm, unifiedArtifactsRepository.items);
            boolean zA1K = AnonymousClass003.A1K(bfm, c1boA02.getValue(), sharedSpace.target);
            Object objAaT2 = bfm.AaT();
            Object objResolveSpaceImageUrl = null;
            if (zA1K || objAaT2 == C78N.A00) {
                Iterator it = ((List) c1boA02.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ArtifactOpenTarget artifactOpenTarget = ((UnifiedArtifact) next).openTarget;
                    if (C7384Etj.areEqual((!(artifactOpenTarget instanceof ArtifactOpenTarget.PeerSpace) || (peerSpace = (ArtifactOpenTarget.PeerSpace) artifactOpenTarget) == null) ? null : peerSpace.getItemKey(), sharedSpace.target.getItemKey())) {
                        break;
                    }
                }
                objAaT2 = (UnifiedArtifact) next;
                bfm.Ai0(objAaT2);
            }
            UnifiedArtifact unifiedArtifact2 = (UnifiedArtifact) objAaT2;
            ArtifactOpenTarget.PeerSpace peerSpace2 = sharedSpace.target;
            boolean zA1S = AnonymousClass005.A1S(bfm, unifiedArtifact2, unifiedArtifactsRepository, sharedSpace);
            Object objAaT3 = bfm.AaT();
            if (zA1S || objAaT3 == C78N.A00) {
                objAaT3 = new SharedSpaceWidgetRendererKt$SharedSpaceCard$catalogEntry$2$1(unifiedArtifact2, unifiedArtifactsRepository, sharedSpace, null);
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA00 = C3UV.A00(bfm, unifiedArtifact2, peerSpace2, unifiedArtifact2, (G0V) objAaT3);
            UnifiedArtifact unifiedArtifact3 = (UnifiedArtifact) mutableStateA00.getValue();
            boolean zA1K2 = AnonymousClass003.A1K(bfm, unifiedArtifact3 != null ? unifiedArtifact3.thumbnailUrl : null, abstractC3358CGzA0h);
            Object objAaT4 = bfm.AaT();
            if (zA1K2 || objAaT4 == C78N.A00) {
                UnifiedArtifact unifiedArtifact4 = (UnifiedArtifact) mutableStateA00.getValue();
                objAaT4 = (unifiedArtifact4 == null || (str = unifiedArtifact4.thumbnailUrl) == null) ? null : resolveSpaceImageUrl(str, abstractC3358CGzA0h);
                bfm.Ai0(objAaT4);
            }
            String str2 = (String) objAaT4;
            String str3 = sharedSpace.iconUrl;
            UnifiedArtifact unifiedArtifact5 = (UnifiedArtifact) mutableStateA00.getValue();
            boolean zA1R = AnonymousClass005.A1R(bfm, str3, unifiedArtifact5 != null ? unifiedArtifact5.iconUrl : null, abstractC3358CGzA0h);
            Object objAaT5 = bfm.AaT();
            if (zA1R || objAaT5 == C78N.A00) {
                String str4 = sharedSpace.iconUrl;
                if (str4 != null || ((unifiedArtifact = (UnifiedArtifact) mutableStateA00.getValue()) != null && (str4 = unifiedArtifact.iconUrl) != null)) {
                    objResolveSpaceImageUrl = resolveSpaceImageUrl(str4, abstractC3358CGzA0h);
                }
                bfm.Ai0(objResolveSpaceImageUrl);
                objAaT5 = objResolveSpaceImageUrl;
            }
            String str5 = (String) objAaT5;
            String str6 = sharedSpace.title;
            boolean zA1M = AnonymousClass003.A1M(bfm, auraNavigatorA0b, sharedSpace);
            Object objAaT6 = bfm.AaT();
            if (zA1M || objAaT6 == C78N.A00) {
                objAaT6 = new SharedSpaceWidgetRendererKt$SharedSpaceCard$1$1(auraNavigatorA0b, sharedSpace);
                bfm.Ai0(objAaT6);
            }
            HatchSpaceBuildCompletedCardKt.m2173SpaceChatCard8r3B23s(str6, str2, str5, j, c1dm, (Function0) objAaT6, bRg2, null, bfm, AnonymousClass001.A05(iA0T << 9, (iA0T << 6) & 64512), 128);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SharedSpaceWidgetRendererKt$SharedSpaceCard$2(sharedSpace, j, c1dm, bRg2, i, i2);
        }
    }

    public static final String resolveSpaceImageUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        return workspaceUriResolver.isDaemonApiReference(str) ? workspaceUriResolver.resolveDaemonApiUrl(str, abstractC3358CGz) : workspaceUriResolver.resolveRawAssetUrl(str, abstractC3358CGz);
    }

    public static final SharedSpace sharedSpace(HatchWidget hatchWidget) {
        OpaqueWidgetData opaqueWidgetData;
        String str;
        Object objA0s;
        String str2;
        String str3;
        ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey;
        String str4;
        String strA0l;
        String strA0l2;
        String str5 = null;
        if (!SHARED_SPACE_KIND.equals(hatchWidget.kind)) {
            return null;
        }
        HatchWidgetData hatchWidgetData = hatchWidget.data;
        if ((hatchWidgetData instanceof OpaqueWidgetData) && (opaqueWidgetData = (OpaqueWidgetData) hatchWidgetData) != null && (str = opaqueWidgetData.dataJson) != null) {
            try {
                objA0s = (SharedSpaceWidgetJson) HatchJsonKt.HatchJson.A00(str, SharedSpaceWidgetJson$$serializer.INSTANCE);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            SharedSpaceWidgetJson sharedSpaceWidgetJson = (SharedSpaceWidgetJson) objA0s;
            if (sharedSpaceWidgetJson != null && (str2 = sharedSpaceWidgetJson.host_muse) != null && (str3 = sharedSpaceWidgetJson.space_id) != null && (peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(FGI.A0U(str2, ":", str3))) != null && (str4 = sharedSpaceWidgetJson.title) != null && (strA0l = AnonymousClass002.A0l(str4)) != null && strA0l.length() > 0) {
                String str6 = sharedSpaceWidgetJson.sender_name;
                if (str6 != null && (strA0l2 = AnonymousClass002.A0l(str6)) != null && strA0l2.length() > 0) {
                    str5 = strA0l2;
                }
                return new SharedSpace(peerSpacePeerSpaceTargetFromItemKey, strA0l, str5, sharedSpaceWidgetJson.icon_url);
            }
        }
        return null;
    }
}
