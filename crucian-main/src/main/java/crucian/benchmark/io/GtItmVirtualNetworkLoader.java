package crucian.benchmark.io;

import vnreal.demands.AbstractDemand;
import vnreal.network.Network;
import vnreal.network.virtual.VirtualLink;
import vnreal.network.virtual.VirtualNetwork;
import vnreal.network.virtual.VirtualNode;

/**
 * Created at 14-3-4 上午10:37.
 *
 * @author lirui
 */
public class GtItmVirtualNetworkLoader extends GtItmNetworkLoader<AbstractDemand, VirtualNode, VirtualLink> {
    private int nextLayer = 1;

    @Override
    protected Network<AbstractDemand, VirtualNode, VirtualLink> createNetwork() {
        return new VirtualNetwork(nextLayer++);
    }

    @Override
    protected VirtualNode createNode(Network<AbstractDemand, VirtualNode, VirtualLink> network) {
        return new VirtualNode(network.getLayer());
    }

    @Override
    protected VirtualLink createLink(Network<AbstractDemand, VirtualNode, VirtualLink> network) {
        return new VirtualLink(network.getLayer());
    }
}
