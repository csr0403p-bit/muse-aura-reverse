package com.facebook.aura.spacesharing.impl;

import com.facebook.aura.network.api.JarvisPath;

/* loaded from: classes4.dex */
public final class SavePath implements JarvisPath.Extension {
    public static final SavePath INSTANCE = new SavePath();
    public static final String value = "api/artifacts/save";

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof SavePath);
    }

    @Override // com.facebook.aura.network.api.JarvisPath
    public String getValue() {
        return value;
    }

    public String toString() {
        return "SavePath";
    }

    public int hashCode() {
        return -1423380824;
    }
}
