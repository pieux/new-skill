package com.shankshsi.new_skill.toy_grizzly;

import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;

import java.io.IOException;


/**
 * Implementation of FilterChain, which replies with the request message.
 */
public class EchoFilter extends BaseFilter {

    /**
     * Handle read operation, when some message come and ready to be processed.
     *
     * @param ctx Context of FilterChainContext processing
     * @return the next action
     * @throws java.io.IOException
     */
    @Override
    public NextAction handleRead(FilterChainContext ctx)
            throws IOException {
        // Peer address is used for non-connected UDP Connection :)
        final Object peerAddress = ctx.getAddress();

        final Object message = ctx.getMessage();

        ctx.write(peerAddress, message, null);

        return ctx.getStopAction();
    }

}
