package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06827l3;
import X.C06847l8;
import X.C0924AIa;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchMessageSendStatus;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.utils.HatchUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class HatchConversationViewModelKt {
    public static final long APPROVAL_ROW_DISMISS_HOLD_MS = 400;
    public static final int MAX_ATTACHMENTS = 10;
    public static final long SCREEN_READER_FOCUS_SETTLE_MS = 500;
    public static final long STOP_DICTATION_TRANSCRIPT_WAIT_MS = 10000;
    public static final C06827l3 MARKDOWN_IMAGE_REGEX = C06827l3.A02("!\\[[^\\]]*]\\(([^)]+)\\)");
    public static final C06827l3 INLINE_IMAGE_TOKEN_REGEX = C06827l3.A02("\\[image:([^\\]]*)]");

    public static final boolean shouldShowConversationTypingCursor(AgentActivityStatus agentActivityStatus) {
        C7384Etj.A0Y(agentActivityStatus, 0);
        String typingIndicatorShowState = HatchUtil.INSTANCE.getTypingIndicatorShowState();
        if (HatchUtil.TYPING_INDICATOR_STATE_OFF.equals(typingIndicatorShowState)) {
            return false;
        }
        if (!HatchUtil.TYPING_INDICATOR_STATE_ON.equals(typingIndicatorShowState)) {
            return AbstractC2159Azp.A12(typingIndicatorShowState, agentActivityStatus.getValue(), true);
        }
        switch (agentActivityStatus.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            default:
                throw C3cG.A0q();
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass002.A13(AgentActivityStatus.RESPONDING, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentActivityStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.COMPOSING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.ONLINE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.COMPACTING, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String extractReplyImageReference(String str) {
        List<String> listAG1;
        String str2;
        List<String> listAG12;
        String str3;
        String strA0l;
        C06847l8 c06847l8A01 = C06827l3.A01(str, MARKDOWN_IMAGE_REGEX);
        if (c06847l8A01 != null && (listAG12 = c06847l8A01.AG1()) != null && (str3 = (String) AbstractC0878AGe.A0A(1, listAG12)) != null && (strA0l = AnonymousClass002.A0l(str3)) != null && strA0l.length() > 0) {
            return strA0l;
        }
        C06847l8 c06847l8A012 = C06827l3.A01(str, INLINE_IMAGE_TOKEN_REGEX);
        if (c06847l8A012 != null && (listAG1 = c06847l8A012.AG1()) != null && (str2 = (String) AbstractC0878AGe.A0A(1, listAG1)) != null) {
            String strA0l2 = AnonymousClass002.A0l(str2);
            String strA0l3 = AnonymousClass002.A0l(C7BY.A0R(strA0l2, strA0l2, ' '));
            if (strA0l3.length() > 0) {
                return strA0l3;
            }
        }
        return null;
    }

    public static final boolean isConfirmedUserMessage(HatchMessage hatchMessage) {
        return hatchMessage.role == HatchMessageRole.USER && hatchMessage.sendStatus == HatchMessageSendStatus.SENT;
    }

    public static final HatchWidget locateWidget(List<? extends HatchConversationListItem> list, String str) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        Object next;
        for (HatchConversationListItem hatchConversationListItem : list) {
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message.message) != null) {
                AHD<HatchWidget> ahd = hatchMessageUiModel.widgets;
                if (ahd != null) {
                    Iterator it = ahd.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (C7384Etj.areEqual(((HatchWidget) next).widgetId, str)) {
                            break;
                        }
                    }
                    HatchWidget hatchWidget = (HatchWidget) next;
                    if (hatchWidget != null) {
                        return hatchWidget;
                    }
                }
                AHD<HatchWidgetPresentation> ahd2 = hatchMessageUiModel.presentations;
                if (ahd2 != null) {
                    Iterator it2 = ahd2.iterator();
                    while (it2.hasNext()) {
                        HatchWidget widget = ((HatchWidgetPresentation) it2.next()).getWidget();
                        if (widget != null && C7384Etj.areEqual(widget.widgetId, str)) {
                            return widget;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    public static final Map<String, String> newestWidgetIdByKindInListOrder(List<? extends HatchConversationListItem> list) {
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        for (HatchConversationListItem hatchConversationListItem : list) {
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message.message) != null) {
                AHD<HatchWidget> ahd = hatchMessageUiModel.widgets;
                if (ahd != null) {
                    for (HatchWidget hatchWidget : ahd) {
                        c0924AIaA0u.put(hatchWidget.kind, hatchWidget.widgetId);
                    }
                }
                AHD<HatchWidgetPresentation> ahd2 = hatchMessageUiModel.presentations;
                if (ahd2 != null) {
                    Iterator it = ahd2.iterator();
                    while (it.hasNext()) {
                        HatchWidget widget = ((HatchWidgetPresentation) it.next()).getWidget();
                        if (widget != null) {
                            c0924AIaA0u.put(widget.kind, widget.widgetId);
                        }
                    }
                }
            }
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
