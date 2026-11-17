package com.facebook.aura.model;

import X.C7384Etj;
import X.F60;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public abstract class HatchAttachmentPresentationJsonKt {
    public static final /* synthetic */ <T> T decodePresentation(JsonElement jsonElement) {
        if (jsonElement instanceof JsonObject) {
            try {
                C7384Etj.A0Q();
                throw F60.createAndThrow();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.HatchAttachmentFile parseAttachmentFile(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L17
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Le
            com.facebook.aura.model.HatchAttachmentFileJson$$serializer r0 = com.facebook.aura.model.HatchAttachmentFileJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L13:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L18
        L17:
            r1 = r2
        L18:
            com.facebook.aura.model.HatchAttachmentFileJson r1 = (com.facebook.aura.model.HatchAttachmentFileJson) r1
            if (r1 == 0) goto L20
            com.facebook.aura.model.HatchAttachmentFile r2 = r1.toDomain()
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseAttachmentFile(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.HatchAttachmentFile");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.AudioPresentationData parseAudioPresentation(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L17
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Le
            com.facebook.aura.model.AudioPresentationJson$$serializer r0 = com.facebook.aura.model.AudioPresentationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L13:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L18
        L17:
            r1 = r2
        L18:
            com.facebook.aura.model.AudioPresentationJson r1 = (com.facebook.aura.model.AudioPresentationJson) r1
            if (r1 == 0) goto L20
            com.facebook.aura.model.AudioPresentationData r2 = r1.toDomain()
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseAudioPresentation(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.AudioPresentationData");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.FilePresentationData parseFilePresentation(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L17
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Le
            com.facebook.aura.model.FilePresentationJson$$serializer r0 = com.facebook.aura.model.FilePresentationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L13:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L18
        L17:
            r1 = r2
        L18:
            com.facebook.aura.model.FilePresentationJson r1 = (com.facebook.aura.model.FilePresentationJson) r1
            if (r1 == 0) goto L20
            com.facebook.aura.model.FilePresentationData r2 = r1.toDomain()
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseFilePresentation(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.FilePresentationData");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.ImageGalleryPresentationData parseImagePresentation(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L19
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L10
            int r0 = com.facebook.aura.model.ImagePresentationJson.$stable     // Catch: java.lang.Throwable -> L10
            com.facebook.aura.model.ImagePresentationJson$$serializer r0 = com.facebook.aura.model.ImagePresentationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L15:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L1a
        L19:
            r1 = r2
        L1a:
            com.facebook.aura.model.ImagePresentationJson r1 = (com.facebook.aura.model.ImagePresentationJson) r1
            if (r1 == 0) goto L22
            com.facebook.aura.model.ImageGalleryPresentationData r2 = r1.toDomain()
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseImagePresentation(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.ImageGalleryPresentationData");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.SlidesPresentationData parseSlidesPresentation(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L17
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Le
            com.facebook.aura.model.SlidesPresentationJson$$serializer r0 = com.facebook.aura.model.SlidesPresentationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Le
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> Le
            goto L13
        Le:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L13:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L18
        L17:
            r1 = r2
        L18:
            com.facebook.aura.model.SlidesPresentationJson r1 = (com.facebook.aura.model.SlidesPresentationJson) r1
            if (r1 == 0) goto L20
            com.facebook.aura.model.SlidesPresentationData r2 = r1.toDomain()
        L20:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseSlidesPresentation(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.SlidesPresentationData");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.VideoPresentationData parseVideoPresentation(kotlinx.serialization.json.JsonElement r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.serialization.json.JsonObject
            r2 = 0
            if (r0 == 0) goto L19
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L10
            int r0 = com.facebook.aura.model.VideoPresentationJson.$stable     // Catch: java.lang.Throwable -> L10
            com.facebook.aura.model.VideoPresentationJson$$serializer r0 = com.facebook.aura.model.VideoPresentationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.A01(r0, r3)     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L15:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L1a
        L19:
            r1 = r2
        L1a:
            com.facebook.aura.model.VideoPresentationJson r1 = (com.facebook.aura.model.VideoPresentationJson) r1
            if (r1 == 0) goto L22
            com.facebook.aura.model.VideoPresentationData r2 = r1.toDomain()
        L22:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.model.HatchAttachmentPresentationJsonKt.parseVideoPresentation(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.VideoPresentationData");
    }
}
