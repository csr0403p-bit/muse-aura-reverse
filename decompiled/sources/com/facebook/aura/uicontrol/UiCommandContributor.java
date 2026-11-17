package com.facebook.aura.uicontrol;

import X.C7384Etj;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public interface UiCommandContributor {

    /* loaded from: classes3.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static String invalidParams(UiCommandContributor uiCommandContributor, String str, JsonObject jsonObject) {
            C7384Etj.A0Y(str, 1);
            return null;
        }
    }

    Map<String, NodeCommandSpec> getSpecs();

    String invalidParams(String str, JsonObject jsonObject);

    ContributedUiAction parse(String str, JsonObject jsonObject);

    /* renamed from: com.facebook.aura.uicontrol.UiCommandContributor$-CC, reason: invalid class name */
    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class CC {
        public static String $default$invalidParams(UiCommandContributor uiCommandContributor, String str, JsonObject jsonObject) {
            return null;
        }

        public static /* synthetic */ String access$invalidParams$jd(UiCommandContributor uiCommandContributor, String str, JsonObject jsonObject) {
            return null;
        }
    }
}
