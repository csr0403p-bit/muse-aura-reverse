package com.facebook.rsys.ai.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class ClientToolDefinition {
    public static G50<ClientToolDefinition> CONVERTER = C8923Ftf.A00(2);
    public static long sMcfTypeId;
    public final String description;
    public final String name;
    public final InputSchema parameters;
    public final boolean terminal;

    public class Builder {
        public String description;
        public String name;
        public InputSchema parameters;
        public boolean terminal;

        public ClientToolDefinition build() {
            return new ClientToolDefinition(this);
        }
    }

    public static native ClientToolDefinition createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClientToolDefinition) {
                ClientToolDefinition clientToolDefinition = (ClientToolDefinition) obj;
                if (this.name.equals(clientToolDefinition.name)) {
                    String str = this.description;
                    String str2 = clientToolDefinition.description;
                    if (str != null ? str.equals(str2) : str2 == null) {
                        InputSchema inputSchema = this.parameters;
                        InputSchema inputSchema2 = clientToolDefinition.parameters;
                        if (inputSchema == null) {
                            if (inputSchema2 != null) {
                                return false;
                            }
                        } else if (inputSchema.equals(inputSchema2)) {
                        }
                        if (this.terminal == clientToolDefinition.terminal) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((BV8.A0B(this.name) + AnonymousClass006.A0G(this.description)) * 31) + C3cH.A02(this.parameters)) * 31) + (this.terminal ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ClientToolDefinition{name=");
        sbA0x.append(this.name);
        sbA0x.append(",description=");
        sbA0x.append(this.description);
        sbA0x.append(",parameters=");
        sbA0x.append(this.parameters);
        sbA0x.append(",terminal=");
        return AbstractC7610F5x.A0y(sbA0x, this.terminal);
    }

    public ClientToolDefinition(Builder builder) {
        builder.name.getClass();
        this.name = builder.name;
        this.description = builder.description;
        this.parameters = builder.parameters;
        this.terminal = builder.terminal;
    }
}
