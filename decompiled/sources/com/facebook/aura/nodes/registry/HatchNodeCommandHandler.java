package com.facebook.aura.nodes.registry;

import X.AbstractC3358CGz;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import java.util.List;

/* loaded from: classes3.dex */
public interface HatchNodeCommandHandler extends HatchNodeCommandHandlerRegistration {

    /* renamed from: com.facebook.aura.nodes.registry.HatchNodeCommandHandler$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getOnlySendsCard(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return false;
        }

        public static boolean $default$isEnabled(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return true;
        }

        public static /* synthetic */ boolean access$getOnlySendsCard$jd(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return false;
        }

        public static /* synthetic */ boolean access$isEnabled$jd(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return true;
        }

        public static String $default$validateParams(HatchNodeCommandHandler hatchNodeCommandHandler, String str) {
            return null;
        }

        public static /* synthetic */ String access$validateParams$jd(HatchNodeCommandHandler hatchNodeCommandHandler, String str) {
            return null;
        }

        public static Object $default$optionalDevicePermissions(HatchNodeCommandHandler hatchNodeCommandHandler, String str, Context context, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object access$optionalDevicePermissions$jd(HatchNodeCommandHandler hatchNodeCommandHandler, String str, Context context, HtJ htJ) {
            return null;
        }

        public static /* synthetic */ Object optionalDevicePermissions$suspendImpl(HatchNodeCommandHandler hatchNodeCommandHandler, String str, Context context, HtJ<? super List<String>> htJ) {
            return null;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getOnlySendsCard(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return false;
        }

        @Deprecated
        public static boolean isEnabled(HatchNodeCommandHandler hatchNodeCommandHandler) {
            return true;
        }

        @Deprecated
        public static String validateParams(HatchNodeCommandHandler hatchNodeCommandHandler, String str) {
            return null;
        }

        @Deprecated
        public static Object optionalDevicePermissions(HatchNodeCommandHandler hatchNodeCommandHandler, String str, Context context, HtJ<? super List<String>> htJ) {
            return null;
        }
    }

    Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ);

    boolean getOnlySendsCard();

    boolean isEnabled();

    Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ);

    String validateParams(String str);
}
