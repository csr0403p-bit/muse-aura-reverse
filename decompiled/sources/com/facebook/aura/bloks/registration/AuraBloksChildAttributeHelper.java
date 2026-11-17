package com.facebook.aura.bloks.registration;

import X.C06H;
import X.C7384Etj;
import X.FAP;
import X.FFI;

/* loaded from: classes6.dex */
public final class AuraBloksChildAttributeHelper implements FAP {
    public static final int $stable = 8;
    public static final String TAG = "AuraBloksChildAttributeHelper";
    public final FAP fallbackMapper;
    public static final Companion Companion = new Companion();
    public static final AuraBloksChildAttributeHelper INSTANCE = new AuraBloksChildAttributeHelper(null);
    public static final int[] NONE = new int[0];
    public static final int[] AUTHENTICITY_DATA_OPENIDCAPTUREOPTIONS_SUBNODES = {40, 62};
    public static final int[] AUTHENTICITY_DATA_OPENSELFIECAPTUREOPTIONS_SUBNODES = {51, 63};
    public static final int[] BK_CDS_BOTTOMSHEET_WRAPPER_SUBNODES = {36, 40, 43, 45, 132};
    public static final int[] BK_COMPONENT_TRANSITIONCONTAINER_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_SUBNODES = {52, 53, 54};
    public static final int[] BK_COMPONENTS_BOTTOMSHEET_SUBNODES = {35, 59, 63, 132};
    public static final int[] BK_COMPONENTS_BOXDECORATION_SUBNODES = {35, 38, 45, 49, 52, 61, 68, 69, 77};
    public static final int[] BK_COMPONENTS_CANVAS_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_CANVASDRAWABLE_SUBNODES = {35};
    public static final int[] BK_COMPONENTS_COLLECTION_SUBNODES = {41, 70, 78, 81, 82, 87, 88, 94, 132};
    public static final int[] BK_COMPONENTS_FLEXBOX_SUBNODES = {38, 52, 132};
    public static final int[] BK_COMPONENTS_GRADIENTTHEMEDCOLORDRAWABLE_SUBNODES = {35, 36, 38};
    public static final int[] BK_COMPONENTS_IMAGE_SUBNODES = {35, 46, 53, 61, 65, 78, 132};
    public static final int[] BK_COMPONENTS_KEYFRAMEV2_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_PARSERESULTWRAPPER_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_PROGRESSBAR_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_PULLTOREFRESHCONTAINER_SUBNODES = {35, 132};
    public static final int[] BK_COMPONENTS_RICHTEXT_SUBNODES = {45, 53, 71, 72, 75, 132, 140};
    public static final int[] BK_COMPONENTS_RIPPLEDRAWABLE_SUBNODES = {35, 36};
    public static final int[] BK_COMPONENTS_SHADEREFFECT_SUBNODES = {35, 46, 132};
    public static final int[] BK_COMPONENTS_SLIDER_SUBNODES = {43, 44, 48, 52, 132};
    public static final int[] BK_COMPONENTS_SPINNER_SUBNODES = {35, 132};
    public static final int[] BK_COMPONENTS_STATEDRAWABLEITEM_SUBNODES = {35};
    public static final int[] BK_COMPONENTS_SWITCH_SUBNODES = {40, 41, 42, 43, 44, 45, 46, 48, 49, 50, 52, 53, 54, 55, 132};
    public static final int[] BK_COMPONENTS_TEXT_SUBNODES = {44, 48, 56, 62, 132};
    public static final int[] BK_COMPONENTS_TEXTINPUT_SUBNODES = {38, 55, 65, 67, 90, 132, 140};
    public static final int[] BK_COMPONENTS_TEXTSPAN_SUBNODES = {41, 44, 48, 53, 59, 69, 132};
    public static final int[] BK_COMPONENTS_THEMEDCOLORDRAWABLE_SUBNODES = {35};
    public static final int[] BK_COMPONENTS_TOOLTIP_SUBNODES = {41, 42, 44, 132};
    public static final int[] BK_COMPONENTS_TOOLTIPCONTAINER_SUBNODES = {42, 43, 132};
    public static final int[] BK_COMPONENTS_VIDEOV2_SUBNODES = {38, 65, 132};
    public static final int[] BK_COMPONENTS_VIEWTRANSFORMSEXTENSION_SUBNODES = {57};
    public static final int[] BK_COMPONENTS_ZOOMABLE_SUBNODES = {35, 42, 132};
    public static final int[] BK_COMPONENTS_ANIMATED_SHAREDELEMENTCONTAINER_SUBNODES = {35, 132};
    public static final int[] BK_COMPONENTS_CDS_GLIMMER_SUBNODES = {35, 38, 41, 132};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_POPUP_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_SPINNER_SUBNODES = {35, 38, 40, 41, 42, 132};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_SPINNERV2_SUBNODES = {35, 132};
    public static final int[] BK_COMPONENTS_DIALOG_BUTTON_SUBNODES = {48};
    public static final int[] BK_COMPONENTS_DIALOG_DIALOG_SUBNODES = {36, 38, 44};
    public static final int[] BK_COMPONENTS_FRONTIER_QRSCANNER_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_INTERNAL_ACTION_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_INTERNAL_MERGE_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_INTERNAL_MERGEWITHBIND_SUBNODES = {132};
    public static final int[] BK_COMPONENTS_SCREEN_NAVBAR_SUBNODES = {35, 43};
    public static final int[] BK_COMPONENTS_SCREEN_SCREEN_SUBNODES = {38, 42, 43, 53};
    public static final int[] BK_COMPONENTS_SCREEN_SCREENWRAPPER_SUBNODES = {35, 36, 38, 132};
    public static final int[] BK_DATA_BORDERV2_SUBNODES = {35, 41, 43, 45, 48, 50, 51};
    public static final int[] BK_DATA_COMPONENTSPAN_SUBNODES = {36, 40};
    public static final int[] BK_DATA_IMAGESPAN_SUBNODES = {38, 41};
    public static final int[] BK_DATA_TEXTSPAN_SUBNODES = {40};
    public static final int[] BK_DATA_ANDROID_ACCESSIBILITY_COLLECTIONITEMINFO_SUBNODES = {132};
    public static final int[] BK_DATA_CDS_MODALCONTAINERCONFIG_SUBNODES = {36, 50, 52, 54, 55, 58, 70};
    public static final int[] BK_DATA_CDS_OPENSCREENOPTIONS_SUBNODES = {49, 55, 57, 58};
    public static final int[] BK_DATA_CDS_UPDATEBOTTOMSHEETOPTIONS_SUBNODES = {35};
    public static final int[] BK_DATA_CDS_UPDATEMODALCONTAINEROPTIONS_SUBNODES = {36};
    public static final int[] BK_DATA_CDS_DECORATION_SHADOW_SUBNODES = {36};
    public static final int[] BK_DATA_CDS_DECORATION_SHADOWV2_SUBNODES = {36, 41};
    public static final int[] BK_DATA_CDS_INTERNAL_SPINNEROPTIONS_SUBNODES = {35};
    public static final int[] BK_DATA_CDS_INTERNAL_SPINNEROPTIONSV2_SUBNODES = {35, 36, 38, 41};
    public static final int[] BK_DATA_CONSENT_CONTAINER_BOTTOMSHEETOPTIONS_SUBNODES = {140};
    public static final int[] BK_DATA_CONSENT_CONTAINER_SCREENOPTIONS_SUBNODES = {140};
    public static final int[] BK_DATA_FRL_OPENURLAUTHCONFIG_SUBNODES = {44};
    public static final int[] BK_DATA_FRONTIER_GOOGLEPAYINTERMEDIATEPAYMENTDATA_SUBNODES = {36};
    public static final int[] BK_DATA_FRONTIER_GOOGLEPAYPAYMENTDATA_SUBNODES = {35, 44};
    public static final int[] BK_DATA_FRONTIER_GOOGLEPAYPAYMENTDATAREQUESTUPDATE_SUBNODES = {35, 36, 38};
    public static final int[] BK_DATA_FRONTIER_LAUNCHGOOGLEPAYSHEETOPTIONS_SUBNODES = {49};
    public static final int[] BK_DATA_LANTANA_ASCEND_INITCONFIG_SUBNODES = {40};
    public static final int[] BK_DATA_LANTANA_ASCEND_STARTCONFIG_SUBNODES = {41};
    public static final int[] BK_DATA_SCREEN_CLOSEPARAMS_SUBNODES = {45};
    public static final int[] BK_DATA_SCREEN_NAVBAR_SUBNODES = {38};
    public static final int[] BK_DATA_SCREEN_SCREEN_SUBNODES = {36, 38, 40, 41, 51, 57};
    public static final int[] BK_DATA_SCREEN_SCREENCONFIG_SUBNODES = {38, 51};
    public static final int[] BK_DATA_SCREEN_CONTAINERCONFIG_FULLSCREEN_MWA_SUBNODES = {35, 36, 41};
    public static final int[] BK_DATA_SCREEN_NAVBAR_CDS_SUBNODES = {35};
    public static final int[] BK_DATA_SCREEN_NAVBAR_CONTRIB_SUBNODES = {35, 36};
    public static final int[] BK_DATA_SCREEN_NAVBAR_MWA_SUBNODES = {43};
    public static final int[] BK_DATA_SCREEN_NAVBAR_CONTRIB_MSG_SUBNODES = {43};
    public static final int[] BK_DATA_SCREEN_SCREEN_CONTRIB_SUBNODES = {35, 36};
    public static final int[] BK_DATA_TOAST_SHOWTOASTOPTIONSV2_SUBNODES = {38, 43};
    public static final int[] BK_DATA_ZOOMABLE_CONFIG_REMOTE_SUBNODES = {42};
    public static final int[] BK_STYLE_BASE_SUBNODES = {62, 66};
    public static final int[] BK_STYLE_TEXTSPAN_BACKGROUNDSTYLE_SUBNODES = {35};
    public static final int[] BK_STYLE_TEXTSPAN_CANVASBACKGROUNDSTYLE_SUBNODES = {35};
    public static final int[] BK_STYLE_TEXTSPAN_COLORSTYLE_SUBNODES = {35};
    public static final int[] BK_STYLE_TEXTSPAN_EXPERIMENTALPREPOSTDRAWSTYLE_SUBNODES = {36, 45};
    public static final int[] BK_STYLE_TEXTSPAN_SHADOWSTYLE_SUBNODES = {35};
    public static final int[] BK_STYLE_TEXTSPAN_TEXTSHADERCANVASSTYLE_SUBNODES = {35};
    public static final int[] BK_TYPES_CANVASFILL_SUBNODES = {35, 38, 40, 41};
    public static final int[] BK_TYPES_CANVASGROUP_SUBNODES = {35, 38};
    public static final int[] BK_TYPES_CANVASLAYER_SUBNODES = {35, 36, 40};
    public static final int[] BK_TYPES_CANVASPATHADD_SUBNODES = {35, 36};
    public static final int[] BK_TYPES_CANVASSHADINGCOLOR_SUBNODES = {35};
    public static final int[] BK_TYPES_CANVASSHADINGGRADIENTLINEAR_SUBNODES = {38, 48};
    public static final int[] BK_TYPES_CANVASSHADINGGRADIENTRADIAL_SUBNODES = {38, 50};
    public static final int[] BK_TYPES_CANVASSHADOW_SUBNODES = {40};
    public static final int[] BK_TYPES_CANVASSTROKE_SUBNODES = {35, 43, 44, 45};
    public static final int[] BK_TYPES_GRIDCOLLECTIONLAYOUTCONFIG_SUBNODES = {40};
    public static final int[] BK_TYPES_SHADOW_SUBNODES = {35};
    public static final int[] BK_TYPES_STAGGEREDGRIDCOLLECTIONLAYOUTCONFIG_SUBNODES = {38};
    public static final int[] COLLECTION_SUBNODES = {54};
    public static final int[] FLEX_SUBNODES = {75};
    public static final int[] IG_COMPONENTS_BOTTOMSHEET_SUBNODES = {36, 132};
    public static final int[] IG_COMPONENTS_DIALOG_DIALOG_SUBNODES = {35, 42, 44, 48, 49, 50, 57, 76};
    public static final int[] IG_COMPONENTS_DIALOG_HEADER_SUBNODES = {41};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBAR_SUBNODES = {36, 43, 46};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBARBUTTON_SUBNODES = {41, 132};
    public static final int[] IG_COMPONENTS_SCREENS_SCREEN_SUBNODES = {40, 41};
    public static final int[] BK_CDS_BOTTOMSHEET_WRAPPER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENT_TRANSITIONCONTAINER_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_PLURAL_SUBNODES = {55};
    public static final int[] BK_COMPONENTS_BOTTOMSHEET_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_CANVAS_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_COLLECTION_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_FLEXBOX_PLURAL_SUBNODES = {32, 43, 133};
    public static final int[] BK_COMPONENTS_IMAGE_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_KEYFRAMEV2_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_PARSERESULTWRAPPER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_PROGRESSBAR_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_PULLTOREFRESHCONTAINER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_RICHTEXT_PLURAL_SUBNODES = {32, 35, 44, 69, 70, 133};
    public static final int[] BK_COMPONENTS_SHADERDRAWABLE_PLURAL_SUBNODES = {40};
    public static final int[] BK_COMPONENTS_SHADEREFFECT_PLURAL_SUBNODES = {43, 133};
    public static final int[] BK_COMPONENTS_SLIDER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_SPINNER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_STATEDRAWABLE_PLURAL_SUBNODES = {35};
    public static final int[] BK_COMPONENTS_SWITCH_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_TEXT_PLURAL_SUBNODES = {51, 133};
    public static final int[] BK_COMPONENTS_TEXTINPUT_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_TEXTSPAN_PLURAL_SUBNODES = {70, 71, 133};
    public static final int[] BK_COMPONENTS_TOOLTIP_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_TOOLTIPCONTAINER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_VIDEOV2_PLURAL_SUBNODES = {35, 133};
    public static final int[] BK_COMPONENTS_ZOOMABLE_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_ANIMATED_SHAREDELEMENTCONTAINER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_CDS_GLIMMER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_POPUP_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_SPINNER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_CDS_INTERNAL_SPINNERV2_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_FRONTIER_QRSCANNER_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_INTERNAL_ACTION_PLURAL_SUBNODES = {133};
    public static final int[] BK_COMPONENTS_INTERNAL_MERGE_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_INTERNAL_MERGEWITHBIND_PLURAL_SUBNODES = {32, 133};
    public static final int[] BK_COMPONENTS_SCREEN_SCREENWRAPPER_PLURAL_SUBNODES = {133};
    public static final int[] BK_DATA_COMPOSABLETEXTSPAN_PLURAL_SUBNODES = {36, 38};
    public static final int[] BK_DATA_IMAGESPAN_PLURAL_SUBNODES = {43};
    public static final int[] BK_DATA_TEXTSPAN_PLURAL_SUBNODES = {36};
    public static final int[] BK_DATA_ANDROID_ACCESSIBILITY_COLLECTIONITEMINFO_PLURAL_SUBNODES = {133};
    public static final int[] BK_DATA_BLOKS_TREERESOURCEREFERENCES_PLURAL_SUBNODES = {41};
    public static final int[] BK_DATA_FRONTIER_GOOGLEPAYSHIPPINGOPTIONPARAMETERS_PLURAL_SUBNODES = {36};
    public static final int[] BK_DATA_FRONTIER_LAUNCHGOOGLEPAYSHEETOPTIONS_PLURAL_SUBNODES = {57};
    public static final int[] BK_DATA_FX_OPENSYNCSCREENOPTIONS_PLURAL_SUBNODES = {36};
    public static final int[] BK_DATA_SCREEN_NAVBAR_PLURAL_SUBNODES = {40};
    public static final int[] BK_DATA_SCREEN_SCREEN_PLURAL_SUBNODES = {42};
    public static final int[] BK_DATA_SCREEN_NAVBAR_MWA_PLURAL_SUBNODES = {41};
    public static final int[] BK_STYLE_TEXTSPAN_LINEARGRADIENTCOLORSTYLE_PLURAL_SUBNODES = {35};
    public static final int[] BK_STYLE_TEXTSPAN_VARIABLEFONTTEXTSTYLE_PLURAL_SUBNODES = {36};
    public static final int[] BK_TYPES_CANVASDEFINITION_PLURAL_SUBNODES = {32};
    public static final int[] BK_TYPES_CANVASGRADIENT_PLURAL_SUBNODES = {36};
    public static final int[] BK_TYPES_CANVASGROUP_PLURAL_SUBNODES = {32};
    public static final int[] BK_TYPES_CANVASLAYER_PLURAL_SUBNODES = {32};
    public static final int[] BK_TYPES_CANVASPATH_PLURAL_SUBNODES = {32};
    public static final int[] BK_TYPES_CANVASTRANSFORM_PLURAL_SUBNODES = {32};
    public static final int[] IG_COMPONENTS_BOTTOMSHEET_PLURAL_SUBNODES = {133};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBAR_PLURAL_SUBNODES = {45};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBARBUTTON_PLURAL_SUBNODES = {133};
    public static final int[] AUTHENTICITY_DATA_UPLOADOPTIONS_EXPRESSION_KEYS = {46};
    public static final int[] BK_ACTION_FX_UNIFIEDLAUNCHEROPTIONS_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_ANDROIDGBOARDCONTENTEXTENSION_EXPRESSION_KEYS = {36};
    public static final int[] BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_EXPRESSION_KEYS = {70, 72};
    public static final int[] BK_COMPONENTS_BKSTEXTINPUTFORMATTER_EXPRESSION_KEYS = {35, 36};
    public static final int[] BK_COMPONENTS_BOTTOMSHEET_EXPRESSION_KEYS = {38, 45, 50, 65, 70, 75};
    public static final int[] BK_COMPONENTS_COLLECTION_EXPRESSION_KEYS = {49, 50, 51, 61, 97, 228};
    public static final int[] BK_COMPONENTS_FLEXBOX_EXPRESSION_KEYS = {45, 46};
    public static final int[] BK_COMPONENTS_FOAGESTUREEXTENSION_EXPRESSION_KEYS = {35, 36, 38, 40, 41, 42, 43, 44, 45, 48, 49, 50, 53, 54, 61, 62, 63, 65, 66};
    public static final int[] BK_COMPONENTS_FOATOUCHEXTENSION_EXPRESSION_KEYS = {35, 36, 38, 40};
    public static final int[] BK_COMPONENTS_IMAGE_EXPRESSION_KEYS = {44, 62, 63};
    public static final int[] BK_COMPONENTS_KEYBOARDLISTENEREXTENSION_EXPRESSION_KEYS = {35, 36, 38, 42, 43, 44, 45, 53, 54};
    public static final int[] BK_COMPONENTS_KEYFRAMEV2_EXPRESSION_KEYS = {36};
    public static final int[] BK_COMPONENTS_ONCLICKEXTENSION_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_ONMOUNT_EXPRESSION_KEYS = {41, 42, 43, 54};
    public static final int[] BK_COMPONENTS_PARSERESULTWRAPPER_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_PULLTOREFRESHCONTAINER_EXPRESSION_KEYS = {36};
    public static final int[] BK_COMPONENTS_RENDERLIFECYCLEEXTENSION_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_RENDERLIFECYCLEEXTENSIONV2_EXPRESSION_KEYS = {35, 36};
    public static final int[] BK_COMPONENTS_RICHTEXT_EXPRESSION_KEYS = {41};
    public static final int[] BK_COMPONENTS_SLIDER_EXPRESSION_KEYS = {38, 41, 42};
    public static final int[] BK_COMPONENTS_SWITCH_EXPRESSION_KEYS = {36};
    public static final int[] BK_COMPONENTS_TEXT_EXPRESSION_KEYS = {40};
    public static final int[] BK_COMPONENTS_TEXTINPUT_EXPRESSION_KEYS = {42, 43, 44, 45, 46, 48, 62};
    public static final int[] BK_COMPONENTS_TEXTSPAN_EXPRESSION_KEYS = {36, 57};
    public static final int[] BK_COMPONENTS_TOOLTIPCONTAINER_EXPRESSION_KEYS = {40, 41, 45};
    public static final int[] BK_COMPONENTS_VIDEOV2_EXPRESSION_KEYS = {43, 44, 45};
    public static final int[] BK_COMPONENTS_VISIBILITYEXTENSION_EXPRESSION_KEYS = {35, 36, 40};
    public static final int[] BK_COMPONENTS_ZOOMABLE_EXPRESSION_KEYS = {41, 43, 44, 45, 46};
    public static final int[] BK_COMPONENTS_DIALOG_BUTTON_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_FRONTIER_QRSCANNER_EXPRESSION_KEYS = {36, 38};
    public static final int[] BK_COMPONENTS_INTERNAL_ACTION_EXPRESSION_KEYS = {35};
    public static final int[] BK_COMPONENTS_SCREEN_SCREEN_EXPRESSION_KEYS = {48, 56};
    public static final int[] BK_COMPONENTS_SCREEN_SCREENWRAPPER_EXPRESSION_KEYS = {40, 41};
    public static final int[] BK_DATA_REQUESTPERMISSIONCONFIG_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_UPLOADV2CONFIG_EXPRESSION_KEYS = {36, 38};
    public static final int[] BK_DATA_ACTION_BLOKS_FETCHASYNCCOMPONENTSOPTIONS_EXPRESSION_KEYS = {42};
    public static final int[] BK_DATA_AISTUDIO_SHAREGUIDEDCONVERSATIONRESULTOPTIONS_EXPRESSION_KEYS = {41};
    public static final int[] BK_DATA_ANDROID_ACCESSIBILITY_ACTION_EXPRESSION_KEYS = {38};
    public static final int[] BK_DATA_ASYNC_ACTION_OPENASYNCACTIONOPTIONS_EXPRESSION_KEYS = {35, 36, 40};
    public static final int[] BK_DATA_BLOKS_ASYNCCOMPONENTCACHEWRITEOPTIONS_EXPRESSION_KEYS = {42};
    public static final int[] BK_DATA_BLOKS_TREERESOURCEREFERENCES_EXPRESSION_KEYS = {43};
    public static final int[] BK_DATA_CDS_CLOSESCREENOPTIONS_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_CDS_MODALCONTAINERCONFIG_EXPRESSION_KEYS = {51, 57, 68};
    public static final int[] BK_DATA_CDS_OPENCDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS = {42, 45};
    public static final int[] BK_DATA_CDS_OPENSCREENOPTIONS_EXPRESSION_KEYS = {40, 44};
    public static final int[] BK_DATA_CDS_PUSHCDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_CDS_PUSHSCREENOPTIONS_EXPRESSION_KEYS = {38};
    public static final int[] BK_DATA_CDS_INTERNAL_INSERTBEFORECDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_CODECAVATAR_CAPTURECONFIG_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_CONSENT_CONTAINER_BOTTOMSHEETOPTIONS_EXPRESSION_KEYS = {35, 40, 41};
    public static final int[] BK_DATA_CONSENT_CONTAINER_SCREENOPTIONS_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_CONTRIB_SCREEN_SCREEN_CDS_EXPRESSION_KEYS = {40};
    public static final int[] BK_DATA_FRL_OPENURLWITHAUTHOPTIONS_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_FX_OPENSYNCSCREENOPTIONS_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_IMAGE_CONTRIB_EXPRESSION_KEYS = {42};
    public static final int[] BK_DATA_LANTANA_SOUNDLEVELPROCESSORSTARTCONFIG_EXPRESSION_KEYS = {35, 36, 38, 40, 52};
    public static final int[] BK_DATA_LANTANA_SOUNDLEVELPROCESSORSTOPCONFIG_EXPRESSION_KEYS = {35, 36};
    public static final int[] BK_DATA_LANTANA_ASCEND_INITCONFIG_EXPRESSION_KEYS = {36, 38};
    public static final int[] BK_DATA_LANTANA_ASCEND_STARTCONFIG_EXPRESSION_KEYS = {36, 38, 40, 42, 43, 44};
    public static final int[] BK_DATA_LANTANA_ASCEND_STOPCONFIG_EXPRESSION_KEYS = {36, 38};
    public static final int[] BK_DATA_MFT_SECURITY_MFA_ISFACTORAVAILABLEOPTIONS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_MFT_SECURITY_MFA_USEFACTOROPTIONS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_MWA_COMPLETEFRLLOGINCALLBACK_EXPRESSION_KEYS = {35};
    public static final int[] BK_DATA_QPL_MARKERPARAMS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_QPL_MARKERPOINTPARAMS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_SCREEN_LIFECYCLECALLBACKS_EXPRESSION_KEYS = {42, 43};
    public static final int[] BK_DATA_SCREEN_NAVIGATIONCALLBACKS_EXPRESSION_KEYS = {35, 36, 44, 45};
    public static final int[] BK_DATA_SCREEN_SCREEN_EXPRESSION_KEYS = {44, 50, 54, 56};
    public static final int[] BK_DATA_SCREEN_SCREENCONFIG_EXPRESSION_KEYS = {40, 52, 53, 54, 55, 56, 57, 58};
    public static final int[] BK_DATA_SCREEN_NAVBAR_CONTRIB_MSG_EXPRESSION_KEYS = {41};
    public static final int[] BK_DATA_SCREEN_NAVBAR_MWA_TRAILINGBUTTON_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_SCREENS_OPENFULLSCREENOPTIONS_EXPRESSION_KEYS = {38};
    public static final int[] BK_DATA_SLV_FWATOASTOPTIONS_EXPRESSION_KEYS = {36};
    public static final int[] BK_DATA_TOAST_SHOWTOASTOPTIONSV2_EXPRESSION_KEYS = {40, 41, 45};
    public static final int[] BK_DATA_ZOOMABLE_CONFIG_REMOTE_EXPRESSION_KEYS = {40, 41};
    public static final int[] BK_EXTENSIONS_ONDATACHANGE_EXPRESSION_KEYS = {35, 40};
    public static final int[] BK_OPTIONS_CAA_LOGIN_FETCHCREDENTIALMANAGEROPTIONS_EXPRESSION_KEYS = {43};
    public static final int[] BK_STYLE_TEXTSPAN_CLICKABLESTYLE_EXPRESSION_KEYS = {36};
    public static final int[] COLLECTION_EXPRESSION_KEYS = {38, 40};
    public static final int[] IG_COMPONENTS_BOTTOMSHEET_EXPRESSION_KEYS = {40, 45, 46, 52, 57};
    public static final int[] IG_COMPONENTS_DIALOG_BUTTON_EXPRESSION_KEYS = {35};
    public static final int[] IG_COMPONENTS_DIALOG_DIALOG_EXPRESSION_KEYS = {43};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBAR_EXPRESSION_KEYS = {44};
    public static final int[] IG_COMPONENTS_SCREENS_NAVBARBUTTON_EXPRESSION_KEYS = {35};
    public static final int[] IG_COMPONENTS_SCREENS_SCREEN_EXPRESSION_KEYS = {49};
    public static final int[] BK_COMPONENTS_RICHTEXT_TEXT_CONTENT_SUBNODES = {80};
    public static final int[] BK_DATA_COMPOSABLETEXTSPAN_TEXT_CONTENT_SUBNODES = {40};

    public AuraBloksChildAttributeHelper() {
        this(null);
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @Override // X.FAP
    public int[] getExpressionAttrs(int i) {
        if (i != 13313 && i != 13314 && i != 13322) {
            if (i == 13323) {
                return BK_COMPONENTS_IMAGE_EXPRESSION_KEYS;
            }
            if (i != 13326) {
                if (i == 13327) {
                    return BK_COMPONENTS_PULLTOREFRESHCONTAINER_EXPRESSION_KEYS;
                }
                if (i == 13329) {
                    return BK_COMPONENTS_RICHTEXT_EXPRESSION_KEYS;
                }
                if (i != 13330) {
                    if (i == 13339) {
                        return BK_COMPONENTS_TEXTSPAN_EXPRESSION_KEYS;
                    }
                    if (i != 13340) {
                        if (i == 13396) {
                            return IG_COMPONENTS_DIALOG_BUTTON_EXPRESSION_KEYS;
                        }
                        if (i == 13397) {
                            return IG_COMPONENTS_DIALOG_DIALOG_EXPRESSION_KEYS;
                        }
                        if (i == 13411) {
                            return IG_COMPONENTS_SCREENS_NAVBAR_EXPRESSION_KEYS;
                        }
                        if (i == 13412) {
                            return IG_COMPONENTS_SCREENS_NAVBARBUTTON_EXPRESSION_KEYS;
                        }
                        switch (i) {
                            case 13317:
                                return BK_COMPONENTS_COLLECTION_EXPRESSION_KEYS;
                            case 13318:
                            case 13319:
                                break;
                            case 13320:
                                return BK_COMPONENTS_FLEXBOX_EXPRESSION_KEYS;
                            default:
                                switch (i) {
                                    case 13332:
                                    case 13333:
                                    case 13337:
                                    case 13346:
                                    case 13360:
                                    case 13368:
                                    case 13566:
                                    case 13615:
                                    case 13666:
                                    case 13674:
                                    case 13688:
                                    case 13690:
                                    case 13708:
                                    case 13735:
                                    case 13762:
                                    case 13785:
                                    case 13797:
                                    case 13798:
                                    case 13799:
                                    case 13805:
                                    case 13806:
                                    case 13807:
                                    case 13808:
                                    case 13841:
                                    case 13856:
                                    case 13908:
                                    case 13950:
                                    case 14003:
                                    case 14008:
                                    case 14009:
                                    case 14047:
                                    case 14048:
                                    case 14049:
                                    case 14062:
                                    case 14093:
                                    case 14143:
                                    case 14145:
                                    case 14148:
                                    case 15728:
                                    case 15729:
                                    case 15752:
                                    case 15772:
                                    case 15775:
                                    case 15777:
                                    case 15778:
                                    case 15820:
                                    case 15960:
                                    case 16052:
                                    case 16061:
                                    case 16063:
                                    case 16088:
                                    case 16089:
                                    case 16108:
                                    case 16111:
                                    case 16118:
                                    case 16297:
                                    case 16342:
                                    case 16372:
                                    case 16373:
                                    case 16418:
                                    case 16446:
                                    case 16447:
                                    case 16482:
                                    case 16483:
                                    case 16515:
                                    case 16524:
                                    case 16526:
                                    case 16586:
                                    case 16588:
                                    case 16589:
                                    case 16590:
                                    case 16591:
                                    case 16593:
                                    case 16594:
                                    case 16595:
                                    case 16596:
                                    case 16597:
                                    case 16598:
                                    case 16599:
                                    case 16600:
                                    case 16601:
                                    case 16603:
                                    case 16604:
                                    case 16606:
                                    case 16607:
                                    case 16608:
                                    case 16610:
                                    case 16613:
                                    case 16614:
                                    case 16615:
                                    case 16616:
                                    case 16618:
                                    case 16621:
                                    case 16623:
                                    case 16628:
                                    case 16629:
                                    case 16630:
                                    case 16631:
                                    case 16632:
                                    case 16672:
                                    case 16754:
                                    case 16787:
                                    case 16830:
                                    case 16834:
                                    case 16851:
                                    case 16857:
                                    case 16861:
                                    case 16867:
                                    case 16869:
                                    case 16870:
                                    case 16871:
                                    case 16874:
                                    case 16875:
                                    case 16876:
                                    case 16879:
                                    case 16880:
                                    case 16886:
                                    case 16887:
                                    case 16891:
                                    case 16898:
                                    case 16917:
                                    case 16958:
                                    case 16962:
                                    case 16999:
                                    case 17018:
                                    case 17157:
                                    case 17184:
                                    case 17213:
                                    case 22639:
                                    case 22695:
                                    case 22703:
                                    case 22732:
                                    case 22746:
                                    case 22815:
                                    case 22848:
                                    case 22849:
                                    case 22881:
                                    case 22918:
                                    case 23447:
                                    case 23468:
                                    case 23726:
                                    case 23752:
                                    case 23922:
                                    case 23923:
                                    case 23932:
                                    case 23990:
                                    case 23991:
                                    case 24094:
                                    case 24201:
                                    case 24647:
                                    case 24727:
                                    case 24728:
                                    case 24729:
                                    case 24879:
                                    case 24893:
                                    case 25261:
                                    case 25262:
                                    case 25546:
                                    case 25706:
                                    case 25707:
                                    case 25708:
                                    case 25709:
                                    case 25711:
                                    case 25713:
                                    case 25714:
                                    case 25715:
                                    case 25716:
                                    case 25717:
                                    case 26222:
                                    case 26381:
                                        break;
                                    case 13334:
                                        return BK_COMPONENTS_SWITCH_EXPRESSION_KEYS;
                                    case 13335:
                                        return BK_COMPONENTS_TEXT_EXPRESSION_KEYS;
                                    case 13336:
                                        return BK_COMPONENTS_TEXTINPUT_EXPRESSION_KEYS;
                                    case 13343:
                                        return BK_COMPONENTS_INTERNAL_ACTION_EXPRESSION_KEYS;
                                    case 13374:
                                        return IG_COMPONENTS_BOTTOMSHEET_EXPRESSION_KEYS;
                                    case 13414:
                                        return IG_COMPONENTS_SCREENS_SCREEN_EXPRESSION_KEYS;
                                    case 13535:
                                        return BK_COMPONENTS_BOTTOMSHEET_EXPRESSION_KEYS;
                                    case 13538:
                                        return BK_COMPONENTS_VISIBILITYEXTENSION_EXPRESSION_KEYS;
                                    case 13647:
                                        return BK_COMPONENTS_SCREEN_SCREEN_EXPRESSION_KEYS;
                                    case 13656:
                                        return BK_COMPONENTS_RENDERLIFECYCLEEXTENSION_EXPRESSION_KEYS;
                                    case 13704:
                                        return BK_DATA_QPL_MARKERPARAMS_EXPRESSION_KEYS;
                                    case 13747:
                                        return BK_DATA_QPL_MARKERPOINTPARAMS_EXPRESSION_KEYS;
                                    case 13750:
                                        return BK_DATA_SCREENS_OPENFULLSCREENOPTIONS_EXPRESSION_KEYS;
                                    case 13768:
                                        return BK_COMPONENTS_BKSTEXTINPUTFORMATTER_EXPRESSION_KEYS;
                                    case 13774:
                                        return BK_COMPONENTS_KEYBOARDLISTENEREXTENSION_EXPRESSION_KEYS;
                                    case 13784:
                                        return BK_DATA_SCREEN_SCREEN_EXPRESSION_KEYS;
                                    case 13800:
                                        return BK_COMPONENTS_DIALOG_BUTTON_EXPRESSION_KEYS;
                                    case 13839:
                                        return BK_DATA_SCREEN_NAVBAR_CONTRIB_MSG_EXPRESSION_KEYS;
                                    case 13901:
                                        return BK_COMPONENTS_PARSERESULTWRAPPER_EXPRESSION_KEYS;
                                    case 13914:
                                        return BK_COMPONENTS_ONMOUNT_EXPRESSION_KEYS;
                                    case 13981:
                                        return BK_COMPONENTS_FOATOUCHEXTENSION_EXPRESSION_KEYS;
                                    case 14001:
                                        return BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_EXPRESSION_KEYS;
                                    case 14059:
                                        return BK_DATA_CDS_OPENCDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS;
                                    case 14117:
                                        return BK_DATA_ANDROID_ACCESSIBILITY_ACTION_EXPRESSION_KEYS;
                                    case 15700:
                                        return BK_DATA_CDS_PUSHCDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS;
                                    case 15757:
                                        return BK_DATA_IMAGE_CONTRIB_EXPRESSION_KEYS;
                                    case 15833:
                                        return BK_COMPONENTS_FOAGESTUREEXTENSION_EXPRESSION_KEYS;
                                    case 15932:
                                        return BK_DATA_CONTRIB_SCREEN_SCREEN_CDS_EXPRESSION_KEYS;
                                    case 15959:
                                        return BK_DATA_CDS_INTERNAL_INSERTBEFORECDSBOTTOMSHEETOPTIONS_EXPRESSION_KEYS;
                                    case 16064:
                                        return AUTHENTICITY_DATA_UPLOADOPTIONS_EXPRESSION_KEYS;
                                    case 16085:
                                        return BK_DATA_CDS_OPENSCREENOPTIONS_EXPRESSION_KEYS;
                                    case 16086:
                                        return BK_DATA_CDS_CLOSESCREENOPTIONS_EXPRESSION_KEYS;
                                    case 16087:
                                        return BK_DATA_CDS_PUSHSCREENOPTIONS_EXPRESSION_KEYS;
                                    case 16121:
                                        return BK_DATA_REQUESTPERMISSIONCONFIG_EXPRESSION_KEYS;
                                    case 16131:
                                        return BK_DATA_ASYNC_ACTION_OPENASYNCACTIONOPTIONS_EXPRESSION_KEYS;
                                    case 16160:
                                        return BK_COMPONENTS_SLIDER_EXPRESSION_KEYS;
                                    case 16209:
                                        return BK_DATA_SCREEN_LIFECYCLECALLBACKS_EXPRESSION_KEYS;
                                    case 16245:
                                        return BK_DATA_BLOKS_TREERESOURCEREFERENCES_EXPRESSION_KEYS;
                                    case 16260:
                                        return BK_COMPONENTS_ZOOMABLE_EXPRESSION_KEYS;
                                    case 16269:
                                        return BK_DATA_TOAST_SHOWTOASTOPTIONSV2_EXPRESSION_KEYS;
                                    case 16310:
                                        return BK_EXTENSIONS_ONDATACHANGE_EXPRESSION_KEYS;
                                    case 16338:
                                        return BK_DATA_FX_OPENSYNCSCREENOPTIONS_EXPRESSION_KEYS;
                                    case 16376:
                                        return BK_DATA_ACTION_BLOKS_FETCHASYNCCOMPONENTSOPTIONS_EXPRESSION_KEYS;
                                    case 16413:
                                        return BK_DATA_CONSENT_CONTAINER_SCREENOPTIONS_EXPRESSION_KEYS;
                                    case 16433:
                                        return BK_DATA_CONSENT_CONTAINER_BOTTOMSHEETOPTIONS_EXPRESSION_KEYS;
                                    case 16444:
                                        return BK_COMPONENTS_TOOLTIPCONTAINER_EXPRESSION_KEYS;
                                    case 16529:
                                        return BK_COMPONENTS_RENDERLIFECYCLEEXTENSIONV2_EXPRESSION_KEYS;
                                    case 16542:
                                        return BK_DATA_CDS_MODALCONTAINERCONFIG_EXPRESSION_KEYS;
                                    case 16584:
                                        return BK_COMPONENTS_KEYFRAMEV2_EXPRESSION_KEYS;
                                    case 16675:
                                        return BK_COMPONENTS_SCREEN_SCREENWRAPPER_EXPRESSION_KEYS;
                                    case 16680:
                                        return BK_DATA_SCREEN_SCREENCONFIG_EXPRESSION_KEYS;
                                    case 16744:
                                        return BK_DATA_BLOKS_ASYNCCOMPONENTCACHEWRITEOPTIONS_EXPRESSION_KEYS;
                                    case 16768:
                                        return BK_DATA_SCREEN_NAVIGATIONCALLBACKS_EXPRESSION_KEYS;
                                    case 16873:
                                        return BK_STYLE_TEXTSPAN_CLICKABLESTYLE_EXPRESSION_KEYS;
                                    case 16913:
                                        return BK_COMPONENTS_ANDROIDGBOARDCONTENTEXTENSION_EXPRESSION_KEYS;
                                    case 16927:
                                        return BK_COMPONENTS_VIDEOV2_EXPRESSION_KEYS;
                                    case 17026:
                                        return BK_DATA_ZOOMABLE_CONFIG_REMOTE_EXPRESSION_KEYS;
                                    case 22699:
                                        return BK_DATA_LANTANA_ASCEND_INITCONFIG_EXPRESSION_KEYS;
                                    case 22700:
                                        return BK_DATA_LANTANA_ASCEND_STARTCONFIG_EXPRESSION_KEYS;
                                    case 22701:
                                        return BK_DATA_LANTANA_ASCEND_STOPCONFIG_EXPRESSION_KEYS;
                                    case 22739:
                                        return BK_DATA_MWA_COMPLETEFRLLOGINCALLBACK_EXPRESSION_KEYS;
                                    case 22863:
                                        return BK_DATA_UPLOADV2CONFIG_EXPRESSION_KEYS;
                                    case 22898:
                                        return BK_DATA_FRL_OPENURLWITHAUTHOPTIONS_EXPRESSION_KEYS;
                                    case 23022:
                                        return BK_DATA_SLV_FWATOASTOPTIONS_EXPRESSION_KEYS;
                                    case 23260:
                                        return BK_DATA_CODECAVATAR_CAPTURECONFIG_EXPRESSION_KEYS;
                                    case 23286:
                                        return BK_DATA_SCREEN_NAVBAR_MWA_TRAILINGBUTTON_EXPRESSION_KEYS;
                                    case 23426:
                                        return BK_COMPONENTS_ONCLICKEXTENSION_EXPRESSION_KEYS;
                                    case 23679:
                                        return BK_OPTIONS_CAA_LOGIN_FETCHCREDENTIALMANAGEROPTIONS_EXPRESSION_KEYS;
                                    case 23875:
                                        return BK_DATA_LANTANA_SOUNDLEVELPROCESSORSTARTCONFIG_EXPRESSION_KEYS;
                                    case 23876:
                                        return BK_DATA_LANTANA_SOUNDLEVELPROCESSORSTOPCONFIG_EXPRESSION_KEYS;
                                    case 24035:
                                        return BK_ACTION_FX_UNIFIEDLAUNCHEROPTIONS_EXPRESSION_KEYS;
                                    case 24238:
                                        return BK_DATA_MFT_SECURITY_MFA_ISFACTORAVAILABLEOPTIONS_EXPRESSION_KEYS;
                                    case 24239:
                                        return BK_DATA_MFT_SECURITY_MFA_USEFACTOROPTIONS_EXPRESSION_KEYS;
                                    case 24650:
                                        return BK_DATA_AISTUDIO_SHAREGUIDEDCONVERSATIONRESULTOPTIONS_EXPRESSION_KEYS;
                                    case 24966:
                                        return BK_COMPONENTS_FRONTIER_QRSCANNER_EXPRESSION_KEYS;
                                    default:
                                        switch (i) {
                                            case 13363:
                                            case 13364:
                                            case 13365:
                                                break;
                                            case 13366:
                                                return COLLECTION_EXPRESSION_KEYS;
                                            default:
                                                FAP fap = this.fallbackMapper;
                                                if (fap == null) {
                                                    FFI.A02("Unexpected style key: ", i);
                                                    return NONE;
                                                }
                                                int[] expressionAttrs = fap.getExpressionAttrs(i);
                                                C7384Etj.A0X(expressionAttrs);
                                                return expressionAttrs;
                                        }
                                }
                        }
                    }
                }
            }
        }
        return NONE;
    }

    @Override // X.FAP
    public int[] getPluralSubNodes(int i) {
        if (i != 13313 && i != 13314 && i != 13322) {
            if (i == 13323) {
                return BK_COMPONENTS_IMAGE_PLURAL_SUBNODES;
            }
            if (i == 13326) {
                return BK_COMPONENTS_PROGRESSBAR_PLURAL_SUBNODES;
            }
            if (i == 13327) {
                return BK_COMPONENTS_PULLTOREFRESHCONTAINER_PLURAL_SUBNODES;
            }
            if (i == 13329) {
                return BK_COMPONENTS_RICHTEXT_PLURAL_SUBNODES;
            }
            if (i != 13330) {
                if (i == 13339) {
                    return BK_COMPONENTS_TEXTSPAN_PLURAL_SUBNODES;
                }
                if (i != 13340 && i != 13396 && i != 13397) {
                    if (i == 13411) {
                        return IG_COMPONENTS_SCREENS_NAVBAR_PLURAL_SUBNODES;
                    }
                    if (i == 13412) {
                        return IG_COMPONENTS_SCREENS_NAVBARBUTTON_PLURAL_SUBNODES;
                    }
                    switch (i) {
                        case 13317:
                            return BK_COMPONENTS_COLLECTION_PLURAL_SUBNODES;
                        case 13318:
                        case 13319:
                            break;
                        case 13320:
                            return BK_COMPONENTS_FLEXBOX_PLURAL_SUBNODES;
                        default:
                            switch (i) {
                                case 13332:
                                    return BK_COMPONENTS_STATEDRAWABLE_PLURAL_SUBNODES;
                                case 13333:
                                case 13337:
                                case 13360:
                                case 13368:
                                case 13414:
                                case 13538:
                                case 13566:
                                case 13615:
                                case 13647:
                                case 13656:
                                case 13674:
                                case 13688:
                                case 13690:
                                case 13704:
                                case 13735:
                                case 13747:
                                case 13750:
                                case 13762:
                                case 13768:
                                case 13774:
                                case 13798:
                                case 13799:
                                case 13800:
                                case 13805:
                                case 13806:
                                case 13807:
                                case 13808:
                                case 13839:
                                case 13841:
                                case 13856:
                                case 13908:
                                case 13914:
                                case 13950:
                                case 13981:
                                case 14003:
                                case 14008:
                                case 14009:
                                case 14047:
                                case 14048:
                                case 14059:
                                case 14062:
                                case 14117:
                                case 14143:
                                case 14145:
                                case 14148:
                                case 15700:
                                case 15729:
                                case 15752:
                                case 15757:
                                case 15772:
                                case 15775:
                                case 15777:
                                case 15820:
                                case 15833:
                                case 15932:
                                case 15959:
                                case 15960:
                                case 16052:
                                case 16061:
                                case 16063:
                                case 16064:
                                case 16085:
                                case 16086:
                                case 16087:
                                case 16088:
                                case 16089:
                                case 16108:
                                case 16118:
                                case 16121:
                                case 16131:
                                case 16209:
                                case 16269:
                                case 16297:
                                case 16310:
                                case 16342:
                                case 16372:
                                case 16373:
                                case 16376:
                                case 16413:
                                case 16418:
                                case 16433:
                                case 16446:
                                case 16447:
                                case 16482:
                                case 16483:
                                case 16515:
                                case 16524:
                                case 16526:
                                case 16529:
                                case 16542:
                                case 16588:
                                case 16589:
                                case 16590:
                                case 16591:
                                case 16595:
                                case 16596:
                                case 16597:
                                case 16598:
                                case 16599:
                                case 16600:
                                case 16601:
                                case 16603:
                                case 16604:
                                case 16607:
                                case 16608:
                                case 16610:
                                case 16613:
                                case 16614:
                                case 16615:
                                case 16616:
                                case 16618:
                                case 16628:
                                case 16629:
                                case 16630:
                                case 16631:
                                case 16632:
                                case 16672:
                                case 16680:
                                case 16744:
                                case 16754:
                                case 16768:
                                case 16787:
                                case 16830:
                                case 16834:
                                case 16857:
                                case 16861:
                                case 16867:
                                case 16869:
                                case 16870:
                                case 16871:
                                case 16873:
                                case 16874:
                                case 16875:
                                case 16876:
                                case 16879:
                                case 16886:
                                case 16891:
                                case 16913:
                                case 16917:
                                case 16958:
                                case 16962:
                                case 16999:
                                case 17018:
                                case 17026:
                                case 17157:
                                case 17213:
                                case 22639:
                                case 22695:
                                case 22699:
                                case 22700:
                                case 22701:
                                case 22703:
                                case 22732:
                                case 22739:
                                case 22746:
                                case 22815:
                                case 22848:
                                case 22863:
                                case 22881:
                                case 22898:
                                case 22918:
                                case 23022:
                                case 23260:
                                case 23286:
                                case 23426:
                                case 23447:
                                case 23468:
                                case 23679:
                                case 23726:
                                case 23875:
                                case 23876:
                                case 23922:
                                case 23923:
                                case 23932:
                                case 23991:
                                case 24035:
                                case 24094:
                                case 24201:
                                case 24238:
                                case 24239:
                                case 24650:
                                case 24727:
                                case 24728:
                                case 24879:
                                case 24893:
                                case 25262:
                                case 25706:
                                case 25707:
                                case 25708:
                                case 25711:
                                case 25713:
                                case 25714:
                                case 25715:
                                case 25717:
                                case 26222:
                                case 26381:
                                    break;
                                case 13334:
                                    return BK_COMPONENTS_SWITCH_PLURAL_SUBNODES;
                                case 13335:
                                    return BK_COMPONENTS_TEXT_PLURAL_SUBNODES;
                                case 13336:
                                    return BK_COMPONENTS_TEXTINPUT_PLURAL_SUBNODES;
                                case 13343:
                                    return BK_COMPONENTS_INTERNAL_ACTION_PLURAL_SUBNODES;
                                case 13346:
                                    return BK_COMPONENTS_INTERNAL_MERGE_PLURAL_SUBNODES;
                                case 13374:
                                    return IG_COMPONENTS_BOTTOMSHEET_PLURAL_SUBNODES;
                                case 13535:
                                    return BK_COMPONENTS_BOTTOMSHEET_PLURAL_SUBNODES;
                                case 13666:
                                    return BK_COMPONENTS_SPINNER_PLURAL_SUBNODES;
                                case 13708:
                                    return BK_COMPONENTS_TOOLTIP_PLURAL_SUBNODES;
                                case 13784:
                                    return BK_DATA_SCREEN_SCREEN_PLURAL_SUBNODES;
                                case 13785:
                                    return BK_DATA_SCREEN_NAVBAR_PLURAL_SUBNODES;
                                case 13797:
                                    return BK_COMPONENT_TRANSITIONCONTAINER_PLURAL_SUBNODES;
                                case 13901:
                                    return BK_COMPONENTS_PARSERESULTWRAPPER_PLURAL_SUBNODES;
                                case 14001:
                                    return BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_PLURAL_SUBNODES;
                                case 14049:
                                    return BK_DATA_ANDROID_ACCESSIBILITY_COLLECTIONITEMINFO_PLURAL_SUBNODES;
                                case 14093:
                                    return BK_CDS_BOTTOMSHEET_WRAPPER_PLURAL_SUBNODES;
                                case 15728:
                                    return BK_COMPONENTS_CDS_INTERNAL_SPINNER_PLURAL_SUBNODES;
                                case 15778:
                                    return BK_COMPONENTS_CDS_GLIMMER_PLURAL_SUBNODES;
                                case 16111:
                                    return BK_COMPONENTS_CDS_INTERNAL_POPUP_PLURAL_SUBNODES;
                                case 16160:
                                    return BK_COMPONENTS_SLIDER_PLURAL_SUBNODES;
                                case 16245:
                                    return BK_DATA_BLOKS_TREERESOURCEREFERENCES_PLURAL_SUBNODES;
                                case 16260:
                                    return BK_COMPONENTS_ZOOMABLE_PLURAL_SUBNODES;
                                case 16338:
                                    return BK_DATA_FX_OPENSYNCSCREENOPTIONS_PLURAL_SUBNODES;
                                case 16444:
                                    return BK_COMPONENTS_TOOLTIPCONTAINER_PLURAL_SUBNODES;
                                case 16584:
                                    return BK_COMPONENTS_KEYFRAMEV2_PLURAL_SUBNODES;
                                case 16586:
                                    return BK_COMPONENTS_CANVAS_PLURAL_SUBNODES;
                                case 16593:
                                    return BK_TYPES_CANVASPATH_PLURAL_SUBNODES;
                                case 16594:
                                    return BK_TYPES_CANVASGRADIENT_PLURAL_SUBNODES;
                                case 16606:
                                    return BK_TYPES_CANVASTRANSFORM_PLURAL_SUBNODES;
                                case 16621:
                                    return BK_TYPES_CANVASGROUP_PLURAL_SUBNODES;
                                case 16623:
                                    return BK_TYPES_CANVASLAYER_PLURAL_SUBNODES;
                                case 16675:
                                    return BK_COMPONENTS_SCREEN_SCREENWRAPPER_PLURAL_SUBNODES;
                                case 16851:
                                    return BK_COMPONENTS_INTERNAL_MERGEWITHBIND_PLURAL_SUBNODES;
                                case 16880:
                                    return BK_DATA_TEXTSPAN_PLURAL_SUBNODES;
                                case 16887:
                                    return BK_DATA_COMPOSABLETEXTSPAN_PLURAL_SUBNODES;
                                case 16898:
                                    return BK_DATA_IMAGESPAN_PLURAL_SUBNODES;
                                case 16927:
                                    return BK_COMPONENTS_VIDEOV2_PLURAL_SUBNODES;
                                case 17184:
                                    return BK_COMPONENTS_ANIMATED_SHAREDELEMENTCONTAINER_PLURAL_SUBNODES;
                                case 22849:
                                    return BK_DATA_SCREEN_NAVBAR_MWA_PLURAL_SUBNODES;
                                case 23752:
                                    return BK_STYLE_TEXTSPAN_VARIABLEFONTTEXTSTYLE_PLURAL_SUBNODES;
                                case 23990:
                                    return BK_COMPONENTS_CDS_INTERNAL_SPINNERV2_PLURAL_SUBNODES;
                                case 24647:
                                    return BK_STYLE_TEXTSPAN_LINEARGRADIENTCOLORSTYLE_PLURAL_SUBNODES;
                                case 24729:
                                    return BK_TYPES_CANVASDEFINITION_PLURAL_SUBNODES;
                                case 24966:
                                    return BK_COMPONENTS_FRONTIER_QRSCANNER_PLURAL_SUBNODES;
                                case 25261:
                                    return BK_COMPONENTS_SHADEREFFECT_PLURAL_SUBNODES;
                                case 25546:
                                    return BK_COMPONENTS_SHADERDRAWABLE_PLURAL_SUBNODES;
                                case 25709:
                                    return BK_DATA_FRONTIER_LAUNCHGOOGLEPAYSHEETOPTIONS_PLURAL_SUBNODES;
                                case 25716:
                                    return BK_DATA_FRONTIER_GOOGLEPAYSHIPPINGOPTIONPARAMETERS_PLURAL_SUBNODES;
                                default:
                                    switch (i) {
                                        case 13363:
                                        case 13364:
                                        case 13365:
                                        case 13366:
                                            break;
                                        default:
                                            FAP fap = this.fallbackMapper;
                                            if (fap == null) {
                                                FFI.A02("Unexpected style key: ", i);
                                                return NONE;
                                            }
                                            int[] pluralSubNodes = fap.getPluralSubNodes(i);
                                            C7384Etj.A0X(pluralSubNodes);
                                            return pluralSubNodes;
                                    }
                            }
                    }
                }
            }
        }
        return NONE;
    }

    @Override // X.FAP
    public int[] getSubNodes(int i) {
        if (i != 13313) {
            if (i == 13314) {
                return BK_COMPONENTS_BOXDECORATION_SUBNODES;
            }
            if (i == 13322) {
                return BK_COMPONENTS_GRADIENTTHEMEDCOLORDRAWABLE_SUBNODES;
            }
            if (i == 13323) {
                return BK_COMPONENTS_IMAGE_SUBNODES;
            }
            if (i == 13326) {
                return BK_COMPONENTS_PROGRESSBAR_SUBNODES;
            }
            if (i == 13327) {
                return BK_COMPONENTS_PULLTOREFRESHCONTAINER_SUBNODES;
            }
            if (i == 13329) {
                return BK_COMPONENTS_RICHTEXT_SUBNODES;
            }
            if (i == 13330) {
                return BK_COMPONENTS_RIPPLEDRAWABLE_SUBNODES;
            }
            if (i == 13339) {
                return BK_COMPONENTS_TEXTSPAN_SUBNODES;
            }
            if (i == 13340) {
                return BK_COMPONENTS_THEMEDCOLORDRAWABLE_SUBNODES;
            }
            if (i != 13396) {
                if (i == 13397) {
                    return IG_COMPONENTS_DIALOG_DIALOG_SUBNODES;
                }
                if (i == 13411) {
                    return IG_COMPONENTS_SCREENS_NAVBAR_SUBNODES;
                }
                if (i == 13412) {
                    return IG_COMPONENTS_SCREENS_NAVBARBUTTON_SUBNODES;
                }
                switch (i) {
                    case 13317:
                        return BK_COMPONENTS_COLLECTION_SUBNODES;
                    case 13318:
                    case 13319:
                        break;
                    case 13320:
                        return BK_COMPONENTS_FLEXBOX_SUBNODES;
                    default:
                        switch (i) {
                            case 13332:
                            case 13337:
                            case 13360:
                            case 13538:
                            case 13566:
                            case 13615:
                            case 13656:
                            case 13674:
                            case 13704:
                            case 13735:
                            case 13747:
                            case 13750:
                            case 13762:
                            case 13768:
                            case 13774:
                            case 13798:
                            case 13806:
                            case 13808:
                            case 13841:
                            case 13856:
                            case 13914:
                            case 13950:
                            case 13981:
                            case 14003:
                            case 14008:
                            case 14009:
                            case 14047:
                            case 14048:
                            case 14059:
                            case 14062:
                            case 14117:
                            case 14143:
                            case 14145:
                            case 14148:
                            case 15700:
                            case 15752:
                            case 15757:
                            case 15772:
                            case 15777:
                            case 15820:
                            case 15833:
                            case 15932:
                            case 15959:
                            case 15960:
                            case 16052:
                            case 16064:
                            case 16086:
                            case 16087:
                            case 16088:
                            case 16089:
                            case 16108:
                            case 16118:
                            case 16121:
                            case 16131:
                            case 16209:
                            case 16245:
                            case 16297:
                            case 16310:
                            case 16338:
                            case 16342:
                            case 16372:
                            case 16376:
                            case 16418:
                            case 16447:
                            case 16482:
                            case 16515:
                            case 16524:
                            case 16529:
                            case 16588:
                            case 16589:
                            case 16590:
                            case 16593:
                            case 16594:
                            case 16596:
                            case 16597:
                            case 16598:
                            case 16599:
                            case 16600:
                            case 16601:
                            case 16603:
                            case 16604:
                            case 16606:
                            case 16607:
                            case 16608:
                            case 16610:
                            case 16628:
                            case 16629:
                            case 16630:
                            case 16631:
                            case 16632:
                            case 16744:
                            case 16768:
                            case 16787:
                            case 16830:
                            case 16834:
                            case 16857:
                            case 16869:
                            case 16870:
                            case 16873:
                            case 16874:
                            case 16876:
                            case 16879:
                            case 16886:
                            case 16887:
                            case 16891:
                            case 16913:
                            case 16917:
                            case 16962:
                            case 16999:
                            case 17018:
                            case 17157:
                            case 17213:
                            case 22639:
                            case 22695:
                            case 22701:
                            case 22732:
                            case 22739:
                            case 22746:
                            case 22815:
                            case 22863:
                            case 22881:
                            case 22898:
                            case 23022:
                            case 23260:
                            case 23286:
                            case 23426:
                            case 23447:
                            case 23468:
                            case 23679:
                            case 23726:
                            case 23752:
                            case 23875:
                            case 23876:
                            case 23922:
                            case 23923:
                            case 23932:
                            case 24035:
                            case 24094:
                            case 24238:
                            case 24239:
                            case 24647:
                            case 24650:
                            case 24729:
                            case 24879:
                            case 25262:
                            case 25546:
                            case 25706:
                            case 25708:
                            case 25711:
                            case 25714:
                            case 25716:
                            case 25717:
                                break;
                            case 13333:
                                return BK_COMPONENTS_STATEDRAWABLEITEM_SUBNODES;
                            case 13334:
                                return BK_COMPONENTS_SWITCH_SUBNODES;
                            case 13335:
                                return BK_COMPONENTS_TEXT_SUBNODES;
                            case 13336:
                                return BK_COMPONENTS_TEXTINPUT_SUBNODES;
                            case 13343:
                                return BK_COMPONENTS_INTERNAL_ACTION_SUBNODES;
                            case 13346:
                                return BK_COMPONENTS_INTERNAL_MERGE_SUBNODES;
                            case 13368:
                                return FLEX_SUBNODES;
                            case 13374:
                                return IG_COMPONENTS_BOTTOMSHEET_SUBNODES;
                            case 13414:
                                return IG_COMPONENTS_SCREENS_SCREEN_SUBNODES;
                            case 13535:
                                return BK_COMPONENTS_BOTTOMSHEET_SUBNODES;
                            case 13647:
                                return BK_COMPONENTS_SCREEN_SCREEN_SUBNODES;
                            case 13666:
                                return BK_COMPONENTS_SPINNER_SUBNODES;
                            case 13688:
                                return BK_COMPONENTS_VIEWTRANSFORMSEXTENSION_SUBNODES;
                            case 13690:
                                return BK_COMPONENTS_SCREEN_NAVBAR_SUBNODES;
                            case 13708:
                                return BK_COMPONENTS_TOOLTIP_SUBNODES;
                            case 13784:
                                return BK_DATA_SCREEN_SCREEN_SUBNODES;
                            case 13785:
                                return BK_DATA_SCREEN_NAVBAR_SUBNODES;
                            case 13797:
                                return BK_COMPONENT_TRANSITIONCONTAINER_SUBNODES;
                            case 13799:
                                return BK_COMPONENTS_DIALOG_DIALOG_SUBNODES;
                            case 13800:
                                return BK_COMPONENTS_DIALOG_BUTTON_SUBNODES;
                            case 13805:
                                return BK_DATA_SCREEN_NAVBAR_CONTRIB_SUBNODES;
                            case 13807:
                                return BK_DATA_SCREEN_SCREEN_CONTRIB_SUBNODES;
                            case 13839:
                                return BK_DATA_SCREEN_NAVBAR_CONTRIB_MSG_SUBNODES;
                            case 13901:
                                return BK_COMPONENTS_PARSERESULTWRAPPER_SUBNODES;
                            case 13908:
                                return IG_COMPONENTS_DIALOG_HEADER_SUBNODES;
                            case 14001:
                                return BK_COMPONENTS_ANDROIDNATIVEACCESSIBILITYEXTENSION_SUBNODES;
                            case 14049:
                                return BK_DATA_ANDROID_ACCESSIBILITY_COLLECTIONITEMINFO_SUBNODES;
                            case 14093:
                                return BK_CDS_BOTTOMSHEET_WRAPPER_SUBNODES;
                            case 15728:
                                return BK_COMPONENTS_CDS_INTERNAL_SPINNER_SUBNODES;
                            case 15729:
                                return BK_DATA_CDS_INTERNAL_SPINNEROPTIONS_SUBNODES;
                            case 15775:
                                return BK_DATA_CDS_DECORATION_SHADOW_SUBNODES;
                            case 15778:
                                return BK_COMPONENTS_CDS_GLIMMER_SUBNODES;
                            case 16061:
                                return AUTHENTICITY_DATA_OPENIDCAPTUREOPTIONS_SUBNODES;
                            case 16063:
                                return AUTHENTICITY_DATA_OPENSELFIECAPTUREOPTIONS_SUBNODES;
                            case 16085:
                                return BK_DATA_CDS_OPENSCREENOPTIONS_SUBNODES;
                            case 16111:
                                return BK_COMPONENTS_CDS_INTERNAL_POPUP_SUBNODES;
                            case 16160:
                                return BK_COMPONENTS_SLIDER_SUBNODES;
                            case 16260:
                                return BK_COMPONENTS_ZOOMABLE_SUBNODES;
                            case 16269:
                                return BK_DATA_TOAST_SHOWTOASTOPTIONSV2_SUBNODES;
                            case 16373:
                                return BK_TYPES_GRIDCOLLECTIONLAYOUTCONFIG_SUBNODES;
                            case 16413:
                                return BK_DATA_CONSENT_CONTAINER_SCREENOPTIONS_SUBNODES;
                            case 16433:
                                return BK_DATA_CONSENT_CONTAINER_BOTTOMSHEETOPTIONS_SUBNODES;
                            case 16444:
                                return BK_COMPONENTS_TOOLTIPCONTAINER_SUBNODES;
                            case 16446:
                                return BK_TYPES_SHADOW_SUBNODES;
                            case 16483:
                                return BK_TYPES_STAGGEREDGRIDCOLLECTIONLAYOUTCONFIG_SUBNODES;
                            case 16526:
                                return BK_DATA_CDS_DECORATION_SHADOWV2_SUBNODES;
                            case 16542:
                                return BK_DATA_CDS_MODALCONTAINERCONFIG_SUBNODES;
                            case 16584:
                                return BK_COMPONENTS_KEYFRAMEV2_SUBNODES;
                            case 16586:
                                return BK_COMPONENTS_CANVAS_SUBNODES;
                            case 16591:
                                return BK_TYPES_CANVASSHADINGCOLOR_SUBNODES;
                            case 16595:
                                return BK_TYPES_CANVASSHADOW_SUBNODES;
                            case 16613:
                                return BK_TYPES_CANVASFILL_SUBNODES;
                            case 16614:
                                return BK_TYPES_CANVASPATHADD_SUBNODES;
                            case 16615:
                                return BK_TYPES_CANVASSHADINGGRADIENTRADIAL_SUBNODES;
                            case 16616:
                                return BK_TYPES_CANVASSHADINGGRADIENTLINEAR_SUBNODES;
                            case 16618:
                                return BK_TYPES_CANVASSTROKE_SUBNODES;
                            case 16621:
                                return BK_TYPES_CANVASGROUP_SUBNODES;
                            case 16623:
                                return BK_TYPES_CANVASLAYER_SUBNODES;
                            case 16672:
                                return BK_DATA_SCREEN_NAVBAR_CDS_SUBNODES;
                            case 16675:
                                return BK_COMPONENTS_SCREEN_SCREENWRAPPER_SUBNODES;
                            case 16680:
                                return BK_DATA_SCREEN_SCREENCONFIG_SUBNODES;
                            case 16754:
                                return BK_DATA_SCREEN_CLOSEPARAMS_SUBNODES;
                            case 16851:
                                return BK_COMPONENTS_INTERNAL_MERGEWITHBIND_SUBNODES;
                            case 16861:
                                return BK_DATA_CDS_UPDATEBOTTOMSHEETOPTIONS_SUBNODES;
                            case 16867:
                                return BK_DATA_CDS_UPDATEMODALCONTAINEROPTIONS_SUBNODES;
                            case 16871:
                                return BK_STYLE_TEXTSPAN_SHADOWSTYLE_SUBNODES;
                            case 16875:
                                return BK_STYLE_TEXTSPAN_COLORSTYLE_SUBNODES;
                            case 16880:
                                return BK_DATA_TEXTSPAN_SUBNODES;
                            case 16898:
                                return BK_DATA_IMAGESPAN_SUBNODES;
                            case 16927:
                                return BK_COMPONENTS_VIDEOV2_SUBNODES;
                            case 16958:
                                return BK_STYLE_TEXTSPAN_EXPERIMENTALPREPOSTDRAWSTYLE_SUBNODES;
                            case 17026:
                                return BK_DATA_ZOOMABLE_CONFIG_REMOTE_SUBNODES;
                            case 17184:
                                return BK_COMPONENTS_ANIMATED_SHAREDELEMENTCONTAINER_SUBNODES;
                            case 22699:
                                return BK_DATA_LANTANA_ASCEND_INITCONFIG_SUBNODES;
                            case 22700:
                                return BK_DATA_LANTANA_ASCEND_STARTCONFIG_SUBNODES;
                            case 22703:
                                return BK_DATA_FRL_OPENURLAUTHCONFIG_SUBNODES;
                            case 22848:
                                return BK_DATA_SCREEN_CONTAINERCONFIG_FULLSCREEN_MWA_SUBNODES;
                            case 22849:
                                return BK_DATA_SCREEN_NAVBAR_MWA_SUBNODES;
                            case 22918:
                                return BK_STYLE_TEXTSPAN_BACKGROUNDSTYLE_SUBNODES;
                            case 23990:
                                return BK_COMPONENTS_CDS_INTERNAL_SPINNERV2_SUBNODES;
                            case 23991:
                                return BK_DATA_CDS_INTERNAL_SPINNEROPTIONSV2_SUBNODES;
                            case 24201:
                                return BK_STYLE_BASE_SUBNODES;
                            case 24727:
                                return BK_COMPONENTS_CANVASDRAWABLE_SUBNODES;
                            case 24728:
                                return BK_STYLE_TEXTSPAN_TEXTSHADERCANVASSTYLE_SUBNODES;
                            case 24893:
                                return BK_STYLE_TEXTSPAN_CANVASBACKGROUNDSTYLE_SUBNODES;
                            case 24966:
                                return BK_COMPONENTS_FRONTIER_QRSCANNER_SUBNODES;
                            case 25261:
                                return BK_COMPONENTS_SHADEREFFECT_SUBNODES;
                            case 25707:
                                return BK_DATA_FRONTIER_GOOGLEPAYPAYMENTDATA_SUBNODES;
                            case 25709:
                                return BK_DATA_FRONTIER_LAUNCHGOOGLEPAYSHEETOPTIONS_SUBNODES;
                            case 25713:
                                return BK_DATA_FRONTIER_GOOGLEPAYINTERMEDIATEPAYMENTDATA_SUBNODES;
                            case 25715:
                                return BK_DATA_FRONTIER_GOOGLEPAYPAYMENTDATAREQUESTUPDATE_SUBNODES;
                            case 26222:
                                return BK_DATA_COMPONENTSPAN_SUBNODES;
                            case 26381:
                                return BK_DATA_BORDERV2_SUBNODES;
                            default:
                                switch (i) {
                                    case 13363:
                                    case 13364:
                                    case 13365:
                                        break;
                                    case 13366:
                                        return COLLECTION_SUBNODES;
                                    default:
                                        FAP fap = this.fallbackMapper;
                                        if (fap == null) {
                                            FFI.A02("Unexpected style key: ", i);
                                            return NONE;
                                        }
                                        int[] subNodes = fap.getSubNodes(i);
                                        C7384Etj.A0X(subNodes);
                                        return subNodes;
                                }
                        }
                }
            }
        }
        return NONE;
    }

    @Override // X.FAP
    public int[] getTextContentSubNodes(int i) {
        int[] textContentSubNodes;
        if (i == 13329) {
            return BK_COMPONENTS_RICHTEXT_TEXT_CONTENT_SUBNODES;
        }
        if (i == 16887) {
            return BK_DATA_COMPOSABLETEXTSPAN_TEXT_CONTENT_SUBNODES;
        }
        FAP fap = this.fallbackMapper;
        return (fap == null || (textContentSubNodes = fap.getTextContentSubNodes(i)) == null) ? NONE : textContentSubNodes;
    }

    public /* synthetic */ AuraBloksChildAttributeHelper(FAP fap, int i, C06H c06h) {
        this((i & 1) != 0 ? null : fap);
    }

    public AuraBloksChildAttributeHelper(FAP fap) {
        this.fallbackMapper = fap;
    }
}
