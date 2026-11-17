package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import com.facebook.aura.maps.model.HatchMapScene;
import kotlinx.serialization.Serializable;

@Serializable(with = LocalMapWidgetDataSerializer.class)
/* loaded from: classes3.dex */
public final class LocalMapWidgetData extends C06G implements HatchWidgetData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String html;
    public final String path;
    public final HatchMapScene scene;

    public final class Companion {
        public final C9hr<LocalMapWidgetData> serializer() {
            return LocalMapWidgetDataSerializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public LocalMapWidgetData(String str, String str2, HatchMapScene hatchMapScene) {
        C7384Etj.A0Y(str, 0);
        this.html = str;
        this.path = str2;
        this.scene = hatchMapScene;
    }

    public final LocalMapWidgetData copy(String str, String str2, HatchMapScene hatchMapScene) {
        C7384Etj.A0Y(str, 0);
        return new LocalMapWidgetData(str, str2, hatchMapScene);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMapWidgetData) {
                LocalMapWidgetData localMapWidgetData = (LocalMapWidgetData) obj;
                if (!C7384Etj.areEqual(this.html, localMapWidgetData.html) || !C7384Etj.areEqual(this.path, localMapWidgetData.path) || !C7384Etj.areEqual(this.scene, localMapWidgetData.scene)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LocalMapWidgetData copy$default(LocalMapWidgetData localMapWidgetData, String str, String str2, HatchMapScene hatchMapScene, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localMapWidgetData.html;
        }
        if ((i & 2) != 0) {
            str2 = localMapWidgetData.path;
        }
        if ((i & 4) != 0) {
            hatchMapScene = localMapWidgetData.scene;
        }
        return localMapWidgetData.copy(str, str2, hatchMapScene);
    }

    public final String component1() {
        return this.html;
    }

    public final String component2() {
        return this.path;
    }

    public final HatchMapScene component3() {
        return this.scene;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getPath() {
        return this.path;
    }

    public final HatchMapScene getScene() {
        return this.scene;
    }

    public int hashCode() {
        return ((AnonymousClass001.A0G(this.html) + AnonymousClass006.A0G(this.path)) * 31) + C3cH.A02(this.scene);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LocalMapWidgetData(String str, String str2, HatchMapScene hatchMapScene, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : hatchMapScene);
    }
}
