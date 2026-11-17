package com.facebook.aura.model;

import X.C10571Hud;
import X.C3cG;
import X.C9sU;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public abstract class HatchMessageJsonKt {
    public static final SpaceBuildCompletedPresentation parseSpaceBuildCompletedPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            objA0s = (SpaceBuildCompletedPresentationJson) HatchJsonKt.HatchJson.A01(SpaceBuildCompletedPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        SpaceBuildCompletedPresentationJson spaceBuildCompletedPresentationJson = (SpaceBuildCompletedPresentationJson) objA0s;
        if (spaceBuildCompletedPresentationJson != null) {
            return spaceBuildCompletedPresentationJson.toDomain();
        }
        return null;
    }

    public static final SpaceProposalPresentation parseSpaceProposalPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = SpaceProposalPresentationJson.$stable;
            objA0s = (SpaceProposalPresentationJson) c9sU.A01(SpaceProposalPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        SpaceProposalPresentationJson spaceProposalPresentationJson = (SpaceProposalPresentationJson) objA0s;
        if (spaceProposalPresentationJson != null) {
            return spaceProposalPresentationJson.toDomain();
        }
        return null;
    }
}
