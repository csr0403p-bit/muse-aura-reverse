package com.facebook.aura.maps.scene;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapElement;
import com.facebook.aura.maps.model.HatchMapScene;
import com.facebook.aura.maps.scene.HatchMapCameraTarget;
import com.meta.maps.core.GeoCoordinates;
import com.meta.maps.core.GeoCoordinatesBoundingBox;
import com.meta.maps.display.SDKInsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchMapCameraDerivation {
    public static final int $stable = 0;
    public static final HatchMapCameraDerivation INSTANCE = new HatchMapCameraDerivation();

    public final HatchMapCameraTarget camera(HatchMapScene hatchMapScene) {
        C7384Etj.A0Y(hatchMapScene, 0);
        HatchMapCameraTarget hatchMapCameraTargetInitialPoint = initialPoint(hatchMapScene);
        if (hatchMapCameraTargetInitialPoint == null) {
            return null;
        }
        if (hatchMapScene.elements.size() != 1) {
            List<HatchMapElement> list = hatchMapScene.elements;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            for (HatchMapElement hatchMapElement : list) {
                arrayListA0i.add(new GeoCoordinates(hatchMapElement.getCoordinate().latitude, hatchMapElement.getCoordinate().longitude));
            }
            hatchMapCameraTargetInitialPoint = new HatchMapCameraTarget.Bounds(GeoCoordinatesBoundingBox.fromCoordinates(arrayListA0i).ensuringMinimumSize(200.0d), new SDKInsets(24.0d, 24.0d, 24.0d, 24.0d));
        }
        return hatchMapCameraTargetInitialPoint;
    }

    public final HatchMapCameraTarget.Point initialPoint(HatchMapScene hatchMapScene) {
        HatchMapCoordinate coordinate;
        C7384Etj.A0Y(hatchMapScene, 0);
        HatchMapElement hatchMapElement = (HatchMapElement) AbstractC0878AGe.A0G(hatchMapScene.elements);
        if (hatchMapElement == null || (coordinate = hatchMapElement.getCoordinate()) == null) {
            return null;
        }
        return new HatchMapCameraTarget.Point(coordinate, 14.0d);
    }
}
