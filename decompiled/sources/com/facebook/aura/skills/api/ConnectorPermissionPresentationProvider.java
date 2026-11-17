package com.facebook.aura.skills.api;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface ConnectorPermissionPresentationProvider {
    Map<String, List<String>> modeOptions(String str, List<ConnectorPermissionMethod> list);
}
