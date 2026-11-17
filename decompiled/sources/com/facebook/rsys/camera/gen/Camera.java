package com.facebook.rsys.camera.gen;

import X.AnonymousClass001;
import X.BV8;
import X.C8926Fti;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class Camera {
    public static long sMcfTypeId;
    public final String identifier;
    public final String name;
    public static final Camera FRONT_FACING_CAMERA = new Camera("generic_front_facing", "Front facing camera");
    public static final Camera BACK_FACING_CAMERA = new Camera("generic_back_facing", "Back facing camera");
    public static final Camera DUAL_CAMERA = new Camera("generic_dual_camera", "Dual camera");
    public static G50<Camera> CONVERTER = C8926Fti.A00(37);

    public static native Camera createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Camera) {
                Camera camera = (Camera) obj;
                if (!this.identifier.equals(camera.identifier) || !this.name.equals(camera.name)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.name, BV8.A0B(this.identifier));
    }

    public String toString() {
        return FGI.A0h("Camera{identifier=", this.identifier, ",name=", this.name, "}");
    }

    public Camera(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.identifier = str;
        this.name = str2;
    }
}
