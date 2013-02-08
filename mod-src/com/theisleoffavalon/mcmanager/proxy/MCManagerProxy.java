/*
 * DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *                    Version 2, December 2004
 * 
 * Copyright (C) 2004 Sam Hocevar <sam@hocevar.net>
 * 
 * Everyone is permitted to copy and distribute verbatim or modified
 * copies of this license document, and changing it is allowed as long
 * as the name is changed.
 * 
 *            DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
 *   TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 * 
 * 0. You just DO WHAT THE FUCK YOU WANT TO.
 */

package com.theisleoffavalon.mcmanager.proxy;


/**
 * A proxy class that hides the details of the client and server implementations of common
 * features. It is recommended that you make this class abstract over a normal interface
 * so that the methods don't have to be implemented on proxies that don't actually
 * implement that functionality. For instance the server doesn't need to do anything
 * on a render call.
 * 
 * @author Cadyyan
 *
 */
public abstract class MCManagerProxy
{
}
