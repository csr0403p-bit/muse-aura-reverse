package com.facebook.aura.nodes.api;

import com.facebook.aura.nodes.core.NodeCommandId;
import java.util.Set;

/* loaded from: classes3.dex */
public interface HatchClientCapabilityPolicy {

    /* renamed from: com.facebook.aura.nodes.api.HatchClientCapabilityPolicy$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static boolean $default$getInAppAlarms(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return true;
        }

        public static boolean $default$getTagsNodeCardsWithClientId(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return false;
        }

        public static HatchUiHandoff $default$getUiHandoff(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return null;
        }

        public static /* synthetic */ boolean access$getInAppAlarms$jd(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return true;
        }

        public static /* synthetic */ boolean access$getTagsNodeCardsWithClientId$jd(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return false;
        }

        public static /* synthetic */ HatchUiHandoff access$getUiHandoff$jd(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return null;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static boolean getInAppAlarms(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return true;
        }

        @Deprecated
        public static boolean getTagsNodeCardsWithClientId(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return false;
        }

        @Deprecated
        public static HatchUiHandoff getUiHandoff(HatchClientCapabilityPolicy hatchClientCapabilityPolicy) {
            return null;
        }
    }

    Set<String> getDataSources();

    Set<NodeCommandId> getDeviceCommands();

    boolean getInAppAlarms();

    boolean getTagsNodeCardsWithClientId();

    Set<String> getUiCommands();

    HatchUiHandoff getUiHandoff();
}
