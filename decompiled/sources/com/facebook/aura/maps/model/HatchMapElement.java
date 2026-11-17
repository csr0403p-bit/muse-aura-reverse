package com.facebook.aura.maps.model;

import X.C9hr;
import X.FGI;
import kotlinx.serialization.Serializable;

@Serializable(with = HatchMapElementSerializer.class)
/* loaded from: classes4.dex */
public interface HatchMapElement {
    public static final Companion Companion = Companion.$$INSTANCE;

    public final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public final C9hr<HatchMapElement> serializer() {
            return HatchMapElementSerializer.INSTANCE;
        }
    }

    String getArtifactId();

    HatchMapCoordinate getCoordinate();

    String getId();

    String getKind();

    /* renamed from: com.facebook.aura.maps.model.HatchMapElement$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static String $default$getArtifactId(HatchMapElement hatchMapElement) {
            return FGI.A0U(hatchMapElement.getKind(), ":", hatchMapElement.getId());
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static String getArtifactId(HatchMapElement hatchMapElement) {
            return CC.$default$getArtifactId(hatchMapElement);
        }
    }
}
