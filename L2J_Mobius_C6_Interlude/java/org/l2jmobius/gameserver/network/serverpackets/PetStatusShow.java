/*
 * This file is part of the L2J Mobius project.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.l2jmobius.gameserver.network.serverpackets;

import org.l2jmobius.commons.network.PacketWriter;
import org.l2jmobius.gameserver.model.actor.Summon;
import org.l2jmobius.gameserver.network.OutgoingPackets;

/**
 * @author Yme
 * @version $Revision: 1.3.2.2.2.4 $ $Date: 2005/03/29 23:15:10 $
 */
public class PetStatusShow implements IClientOutgoingPacket
{
	private final int _summonType;
	
	public PetStatusShow(Summon summon)
	{
		_summonType = summon.getSummonType();
	}
	
	@Override
	public boolean write(PacketWriter packet)
	{
		OutgoingPackets.PET_STATUS_SHOW.writeId(packet);
		packet.writeD(_summonType);
		return true;
	}
}