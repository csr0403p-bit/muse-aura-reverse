package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.C0881AGi;
import com.facebook.aura.maps.intf.NativeMaps;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchRenderingCapabilities {
    public static final int $stable = 0;
    public static final HatchRenderingCapabilities INSTANCE = new HatchRenderingCapabilities();
    public static final List<String> supportedInlinePresentations = Arrays.asList(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, "html", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LOCAL_MAP, HatchWidgetPresentationKt.HATCH_WIDGET_KIND_LETTER, "idea", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IDEA_GROUP, "navigation", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_IMAGE_OPTIONS, HatchWidgetPresentationKt.HATCH_WIDGET_KIND_VOICE_OPTIONS, "space_build_completed", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_NODE_CARD);
    public static final String NODE_CARD_NOTIFICATION_OPT_IN_CAPABILITY = "node_card.notification_opt_in";
    public static final String INTERNAL_LINK_ACTION_CARD_WALLET_SETUP_CAPABILITY = "internal_link_action_card.wallet_setup";
    public static final String AVATAR_SHARE_DANCES_CAPABILITY = "avatar_share.dances";
    public static final String CAR_RENTAL_RESERVATION_APPROVAL_CAPABILITY = "approval.car_rental_reservation";
    public static final List<String> standalonePresentations = Arrays.asList(NODE_CARD_NOTIFICATION_OPT_IN_CAPABILITY, INTERNAL_LINK_ACTION_CARD_WALLET_SETUP_CAPABILITY, AVATAR_SHARE_DANCES_CAPABILITY, CAR_RENTAL_RESERVATION_APPROVAL_CAPABILITY, "file", "image", "video", "audio", HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SLIDES, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_RESULTS_V2, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SHOPPING_CART, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_COMPLIMENTARY_SUBSCRIPTION, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_TEXT_WITH_BUTTON, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_PAIRING_LAUNCHER, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SCHEDULED_TASK_CREATED_ACTIVITY, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_BROWSER_TASK, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_SPACE_PROPOSAL, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_EXTERNAL_LINK, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_INTERNAL_LINK_ACTION_CARD, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_GENERIC_LIST, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_AVATAR_SHARE, HatchWidgetPresentationKt.HATCH_PRESENTATION_KIND_NAVIGATION_SCHEDULED_TASK);
    public static final String TEXT_ENTITY_SHOPPING_PRODUCT_CHIPS = "shopping_product_entity_chips";
    public static final List<String> supportedTextEntities = Collections.singletonList(TEXT_ENTITY_SHOPPING_PRODUCT_CHIPS);

    private final List<String> getNativeMapPresentations() {
        return NativeMaps.INSTANCE.getRenderer() != null ? Collections.singletonList(HatchWidgetPresentationKt.HATCH_WIDGET_KIND_MARKETPLACE_MAP) : C0881AGi.A00;
    }

    public final List<String> getSupportedInlinePresentations() {
        return supportedInlinePresentations;
    }

    public final List<String> getSupportedPresentations() {
        return AbstractC0878AGe.A0P(supportedInlinePresentations, AbstractC0878AGe.A0P(getNativeMapPresentations(), standalonePresentations));
    }

    public final List<String> getSupportedTextEntities() {
        return supportedTextEntities;
    }
}
