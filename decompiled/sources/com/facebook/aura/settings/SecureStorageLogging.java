package com.facebook.aura.settings;

import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0924AIa;
import X.C7384Etj;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchAppEventLoggingContext;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchEventType;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchRequestFailureMetadataKt;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.Map;

/* loaded from: classes.dex */
public final class SecureStorageLogging {
    public static final int $stable = 0;
    public static final String DETAILS_LOAD_EVENT = "secure_storage_details_load";
    public static final SecureStorageLogging INSTANCE = new SecureStorageLogging();
    public static final String KEY_CREDENTIAL_ID = "credential_id";
    public static final String KEY_TRIGGER = "trigger";

    public final void addLoginClick(HatchComponent hatchComponent, boolean z) {
        C7384Etj.A0Y(hatchComponent, 0);
        click(HatchScreen.SECURE_STORAGE_ADD_LOGIN, hatchComponent, z ? HatchSurface.CHAT : HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, null);
    }

    public final void addLoginFailed(boolean z, String str) {
        C7384Etj.A0Y(str, 1);
        click(HatchScreen.SECURE_STORAGE_ADD_LOGIN, HatchComponent.SECURE_STORAGE_ADD_FAILED, z ? HatchSurface.CHAT : HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str));
    }

    public final void credentialRowTapped(String str) {
        C7384Etj.A0Y(str, 0);
        click(HatchScreen.SECURE_STORAGE_LIST, HatchComponent.SECURE_STORAGE_CREDENTIAL_ROW, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, str, null);
    }

    public final void deleteCancelTapped(String str) {
        C7384Etj.A0Y(str, 0);
        deleteDialogClick(HatchComponent.DELETE_CANCEL_BUTTON, str);
    }

    public final void deleteConfirmTapped(String str) {
        C7384Etj.A0Y(str, 0);
        deleteDialogClick(HatchComponent.DELETE_CONFIRM_BUTTON, str);
    }

    public final void deleteTapped(String str) {
        C7384Etj.A0Y(str, 0);
        detailClick(HatchComponent.DELETE_BUTTON, str);
    }

    public final void detailClick(HatchComponent hatchComponent, String str) {
        AnonymousClass003.A0u(hatchComponent, str);
        click(HatchScreen.SECURE_STORAGE_DETAIL, hatchComponent, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, str, null);
    }

    public final void detailsLoadResult(String str, boolean z, boolean z2, Throwable th, HatchAppEventLoggingContext hatchAppEventLoggingContext) {
        AnonymousClass002.A1C(str, 0, hatchAppEventLoggingContext);
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        String value = HatchSurface.SETTINGS.getValue();
        String value2 = HatchSubsurface.SECURE_STORAGE.getValue();
        String value3 = HatchEventType.STATUS_CHECK.getValue();
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(KEY_CREDENTIAL_ID, str);
        c0924AIa.put("trigger", z ? "retry" : "initial");
        c0924AIa.put(HatchMetadataKey.ENTRY_POINT.getValue(), z2 ? "chat_card" : "settings");
        c0924AIa.put(HatchMetadataKey.RESULT.getValue(), th == null ? "success" : "error");
        if (th != null) {
            HatchRequestFailureMetadataKt.putRequestFailure(c0924AIa, th);
        }
        hatchAppEventLogger.logEvent(DETAILS_LOAD_EVENT, value, value2, value3, null, AIW.A0K(c0924AIa), hatchAppEventLoggingContext);
    }

    public final void editTapped(String str) {
        C7384Etj.A0Y(str, 0);
        detailClick(HatchComponent.EDIT_BUTTON, str);
    }

    public final void passwordRevealTapped(String str) {
        C7384Etj.A0Y(str, 0);
        detailClick(HatchComponent.SECURE_STORAGE_PASSWORD_REVEAL_BUTTON, str);
    }

    public final void saveTapped(String str) {
        C7384Etj.A0Y(str, 0);
        detailClick(HatchComponent.SAVE_BUTTON, str);
    }

    public final void updateFailed(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        click(HatchScreen.SECURE_STORAGE_DETAIL, HatchComponent.SECURE_STORAGE_UPDATE_FAILED, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, str, AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str2));
    }

    public final void verificationClick(HatchComponent hatchComponent) {
        C7384Etj.A0Y(hatchComponent, 0);
        click(HatchScreen.SECURE_STORAGE_VERIFICATION_CODE, hatchComponent, HatchSurface.CHAT, HatchSubsurface.SECURE_STORAGE, null, null);
    }

    public final void verificationFailed(String str) {
        C7384Etj.A0Y(str, 0);
        click(HatchScreen.SECURE_STORAGE_VERIFICATION_CODE, HatchComponent.SECURE_STORAGE_ADD_FAILED, HatchSurface.CHAT, HatchSubsurface.SECURE_STORAGE, null, AnonymousClass007.A0c(HatchMetadataKey.FAILURE_REASON, str));
    }

    private final void click(HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, str, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void click$default(SecureStorageLogging secureStorageLogging, HatchScreen hatchScreen, HatchComponent hatchComponent, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, String str, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchSurface = HatchSurface.SETTINGS;
        }
        if ((i & 8) != 0) {
            hatchSubsurface = HatchSubsurface.SECURE_STORAGE;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        secureStorageLogging.click(hatchScreen, hatchComponent, hatchSurface, hatchSubsurface, str, map);
    }

    private final void deleteDialogClick(HatchComponent hatchComponent, String str) {
        click(HatchScreen.SECURE_STORAGE_DETAIL, hatchComponent, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE_DELETE_DIALOG, str, null);
    }

    private final HatchSurface surfaceFor(boolean z) {
        return z ? HatchSurface.CHAT : HatchSurface.SETTINGS;
    }

    public final void addLoginCancelTapped(boolean z) {
        addLoginClick(HatchComponent.CANCEL_BUTTON, z);
    }

    public final void addLoginCloseTapped(boolean z) {
        addLoginClick(HatchComponent.CLOSE_BUTTON, z);
    }

    public final void addLoginPasswordRevealTapped(boolean z, boolean z2) {
        click(HatchScreen.SECURE_STORAGE_ADD_LOGIN, HatchComponent.SECURE_STORAGE_PASSWORD_REVEAL_BUTTON, z ? HatchSurface.CHAT : HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, AnonymousClass006.A10(HatchMetadataKey.IS_SHOWING.getValue(), String.valueOf(z2)));
    }

    public final void addLoginSubmitTapped(boolean z) {
        addLoginClick(HatchComponent.SECURE_STORAGE_ADD_SUBMIT_BUTTON, z);
    }

    public final void addTapped() {
        click(HatchScreen.SECURE_STORAGE_LIST, HatchComponent.SECURE_STORAGE_ADD_BUTTON, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, null);
    }

    public final void customConnectorDeleteCancelTapped() {
        deleteDialogClick(HatchComponent.DELETE_CANCEL_BUTTON, null);
    }

    public final void customConnectorDeleteConfirmTapped() {
        deleteDialogClick(HatchComponent.DELETE_CONFIRM_BUTTON, null);
    }

    public final void customConnectorDeleteTapped() {
        click(HatchScreen.SECURE_STORAGE_DETAIL, HatchComponent.DELETE_BUTTON, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, null);
    }

    public final void customConnectorRowTapped() {
        click(HatchScreen.SECURE_STORAGE_LIST, HatchComponent.SECURE_STORAGE_CREDENTIAL_ROW, HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, null, null);
    }

    public final void deleteDismissed(String str) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE_DELETE_DIALOG, HatchScreen.SECURE_STORAGE_DETAIL, HatchComponent.DELETE_CANCEL_BUTTON, str, null);
    }

    public final void entryRowTapped() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.TAB_SETTINGS, HatchScreen.SETTINGS_MAIN, HatchComponent.SECURE_STORAGE, null, null, null);
    }

    public final void saveToggled(boolean z, boolean z2, boolean z3) {
        HatchInteractionLogger.INSTANCE.logToggle(z3, z ? HatchSurface.CHAT : HatchSurface.SETTINGS, HatchSubsurface.SECURE_STORAGE, HatchScreen.SECURE_STORAGE_ADD_LOGIN, HatchComponent.SECURE_STORAGE_SAVE_TOGGLE, null, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), z2 ? "agent_capture" : "manual"));
    }

    public final void verificationCancelTapped() {
        verificationClick(HatchComponent.CANCEL_BUTTON);
    }

    public final void verificationSubmitTapped() {
        verificationClick(HatchComponent.SECURE_STORAGE_VERIFICATION_SUBMIT_BUTTON);
    }
}
