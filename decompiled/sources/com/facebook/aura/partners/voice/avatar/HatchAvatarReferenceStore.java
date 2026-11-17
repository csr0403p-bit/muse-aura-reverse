package com.facebook.aura.partners.voice.avatar;

import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BzK;
import X.C4oT;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.CH0;
import X.FGI;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.prefs.VoiceUserPrefStore;

/* loaded from: classes2.dex */
public final class HatchAvatarReferenceStore {
    public final AbstractC3358CGz userSession;

    public HatchAvatarReferenceStore(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        remove(HatchAvatarReferenceStoreKt.LEGACY_RECIPE_STATE_KEY);
    }

    public final StoredAvatarReference reference(String str) {
        C7384Etj.A0Y(str, 0);
        return read(FGI.A0M(HatchAvatarReferenceStoreKt.REFERENCE_KEY_PREFIX, str));
    }

    public final HatchAvatarReference selection(String str) {
        HatchAvatarReference hatchAvatarReference;
        String str2;
        C7384Etj.A0Y(str, 0);
        StoredAvatarReference storedAvatarReference = read(FGI.A0M(HatchAvatarReferenceStoreKt.SELECTION_KEY_PREFIX, str));
        if (storedAvatarReference == null || (hatchAvatarReference = storedAvatarReference.reference) == null || (str2 = hatchAvatarReference.imageUri) == null || C7BY.A0j(str2)) {
            return null;
        }
        return hatchAvatarReference;
    }

    public final void storeReadiness(HatchVoiceReadinessRecord hatchVoiceReadinessRecord) {
        C7384Etj.A0Y(hatchVoiceReadinessRecord, 0);
        StoredVoiceReadinessJson storedVoiceReadinessJson = new StoredVoiceReadinessJson(hatchVoiceReadinessRecord.gatewayUrl, hatchVoiceReadinessRecord.vmId, hatchVoiceReadinessRecord.avatarImagePath, hatchVoiceReadinessRecord.avatarImageUpdatedMs, hatchVoiceReadinessRecord.avatarStillPath, hatchVoiceReadinessRecord.selectionKind, hatchVoiceReadinessRecord.fullFrame, hatchVoiceReadinessRecord.assetId, hatchVoiceReadinessRecord.cropTop, hatchVoiceReadinessRecord.cropBottom, hatchVoiceReadinessRecord.sourceSha1, hatchVoiceReadinessRecord.idleVideoUri, hatchVoiceReadinessRecord.referenceImageUri, hatchVoiceReadinessRecord.referenceCropX, hatchVoiceReadinessRecord.referenceCropY, hatchVoiceReadinessRecord.referenceCropSize, hatchVoiceReadinessRecord.embodimentCompatible, hatchVoiceReadinessRecord.avatarStillSha1, hatchVoiceReadinessRecord.referenceFromOriginal, System.currentTimeMillis());
        try {
            BzK bzKA9q = prefs().A9q();
            bzKA9q.AYr(HatchAvatarReferenceStoreKt.READINESS_KEY, HatchJsonKt.HatchJson.A02(storedVoiceReadinessJson, StoredVoiceReadinessJson$$serializer.INSTANCE));
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0K(HatchAvatarReferenceStoreKt.TAG, e, "Could not persist voice readiness");
        }
    }

    private final C4oT prefs() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.userSession).A01, VoiceUserPrefStore.INSTANCE);
    }

    private final StoredAvatarReference read(String str) {
        String string = prefs().getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            StoredAvatarReferenceJson storedAvatarReferenceJson = (StoredAvatarReferenceJson) HatchJsonKt.HatchJson.A00(string, StoredAvatarReferenceJson$$serializer.INSTANCE);
            String str2 = storedAvatarReferenceJson.asset_id;
            if (str2.length() == 0) {
                remove(str);
                return null;
            }
            if (Math.abs(System.currentTimeMillis() - storedAvatarReferenceJson.written_at_ms) <= 604800000) {
                return new StoredAvatarReference(new HatchAvatarReference(str2, storedAvatarReferenceJson.crop_x, storedAvatarReferenceJson.crop_y, storedAvatarReferenceJson.crop_size, storedAvatarReferenceJson.source_sha1, storedAvatarReferenceJson.image_uri, null, storedAvatarReferenceJson.embodiment_compatible), storedAvatarReferenceJson.crop_refreshed);
            }
            remove(str);
            return null;
        } catch (Exception e) {
            CFK.A0K(HatchAvatarReferenceStoreKt.TAG, e, "Dropping an undecodable record");
            remove(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        try {
            String strA02 = HatchJsonKt.HatchJson.A02(new StoredAvatarReferenceJson(hatchAvatarReference.assetId, hatchAvatarReference.cropX, hatchAvatarReference.cropY, hatchAvatarReference.cropSize, hatchAvatarReference.sourceSha1, hatchAvatarReference.imageUri, z, hatchAvatarReference.embodimentCompatible, System.currentTimeMillis()), StoredAvatarReferenceJson$$serializer.INSTANCE);
            BzK bzKA9q = prefs().A9q();
            bzKA9q.AYr(str, strA02);
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0K(HatchAvatarReferenceStoreKt.TAG, e, "Could not persist the embodiment reference");
        }
    }

    public final void clearReadiness() {
        remove(HatchAvatarReferenceStoreKt.READINESS_KEY);
    }

    public final HatchVoiceReadinessRecord readiness() {
        String string = prefs().getString(HatchAvatarReferenceStoreKt.READINESS_KEY, null);
        if (string == null) {
            return null;
        }
        try {
            StoredVoiceReadinessJson storedVoiceReadinessJson = (StoredVoiceReadinessJson) HatchJsonKt.HatchJson.A00(string, StoredVoiceReadinessJson$$serializer.INSTANCE);
            String str = storedVoiceReadinessJson.asset_id;
            if (str.length() == 0) {
                clearReadiness();
                return null;
            }
            if (Math.abs(System.currentTimeMillis() - storedVoiceReadinessJson.written_at_ms) <= 604800000) {
                return new HatchVoiceReadinessRecord(storedVoiceReadinessJson.gateway_url, storedVoiceReadinessJson.vm_id, storedVoiceReadinessJson.avatar_image_path, storedVoiceReadinessJson.avatar_image_updated_ms, storedVoiceReadinessJson.avatar_still_path, storedVoiceReadinessJson.selection_kind, storedVoiceReadinessJson.full_frame, str, storedVoiceReadinessJson.crop_top, storedVoiceReadinessJson.crop_bottom, storedVoiceReadinessJson.source_sha1, storedVoiceReadinessJson.idle_video_uri, storedVoiceReadinessJson.reference_image_uri, storedVoiceReadinessJson.reference_crop_x, storedVoiceReadinessJson.reference_crop_y, storedVoiceReadinessJson.reference_crop_size, storedVoiceReadinessJson.embodiment_compatible, storedVoiceReadinessJson.avatar_still_sha1, storedVoiceReadinessJson.reference_from_original);
            }
            clearReadiness();
            return null;
        } catch (Exception e) {
            CFK.A0K(HatchAvatarReferenceStoreKt.TAG, e, "Dropping an undecodable readiness record");
            clearReadiness();
            return null;
        }
    }

    private final void remove(String str) {
        BzK bzKA9q = prefs().A9q();
        bzKA9q.Aae(str);
        bzKA9q.apply();
    }

    public final void storeReference(String str, HatchAvatarReference hatchAvatarReference, boolean z) {
        AnonymousClass003.A0u(str, hatchAvatarReference);
        write(FGI.A0M(HatchAvatarReferenceStoreKt.REFERENCE_KEY_PREFIX, str), hatchAvatarReference, z);
    }

    public final void storeSelection(String str, HatchAvatarReference hatchAvatarReference) {
        write(FGI.A0M(HatchAvatarReferenceStoreKt.SELECTION_KEY_PREFIX, str), hatchAvatarReference, AnonymousClass004.A1b(str, hatchAvatarReference));
    }
}
