package com.facebook.aura.uicontrol;

import X.AGH;
import X.AbstractC5321DgF;
import X.AbstractC7607F5u;
import X.AnonymousClass003;
import X.C9jH;
import X.F0C;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.uicontrol.UiAction;
import com.facebook.aura.uicontrol.UiActionParseResult;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class UiCommandContributors {
    public static final UiCommandContributors INSTANCE = new UiCommandContributors();
    public static final F0C contributors$delegate = AbstractC5321DgF.A03(UiCommandContributors$contributors$2.INSTANCE);

    private final List<UiCommandContributor> getContributors() {
        return (List) contributors$delegate.getValue();
    }

    public final Map<String, NodeCommandSpec> specs() {
        List list = (List) contributors$delegate.getValue();
        Map<String, NodeCommandSpec> mapA02 = C9jH.A00;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mapA02 = AGH.A02(mapA02, ((UiCommandContributor) it.next()).getSpecs());
        }
        return mapA02;
    }

    public final UiActionParseResult parse(String str, JsonObject jsonObject, UiActionMode uiActionMode) {
        UiActionParseResult uiActionParseResult;
        UiActionParseResult failed;
        AnonymousClass003.A0v(str, uiActionMode);
        Iterator itA13 = AbstractC7607F5u.A13(contributors$delegate.getValue());
        while (true) {
            uiActionParseResult = null;
            if (!itA13.hasNext()) {
                break;
            }
            UiCommandContributor uiCommandContributor = (UiCommandContributor) itA13.next();
            String strInvalidParams = uiCommandContributor.invalidParams(str, jsonObject);
            if (strInvalidParams != null) {
                failed = new UiActionParseResult.Failed("invalid_params", strInvalidParams);
            } else {
                ContributedUiAction contributedUiAction = uiCommandContributor.parse(str, jsonObject);
                if (contributedUiAction != null) {
                    failed = new UiActionParseResult.Parsed(new UiAction.Contributed(contributedUiAction), uiActionMode);
                } else {
                    continue;
                }
            }
            uiActionParseResult = failed;
            if (uiActionParseResult != null) {
                break;
            }
        }
        return uiActionParseResult;
    }
}
